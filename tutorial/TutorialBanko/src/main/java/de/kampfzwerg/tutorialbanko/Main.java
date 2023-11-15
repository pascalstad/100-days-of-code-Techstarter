package de.kampfzwerg.tutorialbanko;

import de.kampfzwerg.tutorialbanko.commands.TimerCommand;
import de.kampfzwerg.tutorialbanko.listeners.JoinListener;
import de.kampfzwerg.tutorialbanko.listeners.QuitListener;
import de.kampfzwerg.tutorialbanko.timer.Timer;
import de.kampfzwerg.tutorialbanko.timer.TimerDataManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main instance;
    private Timer timer;
    private TimerDataManager timerDataManager;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "Server is running");

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new JoinListener(), this);
        manager.registerEvents(new QuitListener(), this);

        getCommand("timer").setExecutor(new TimerCommand());
        timerDataManager = new TimerDataManager(getDataFolder());
        timer = timerDataManager.loadTimerData();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        timerDataManager.saveTimerData(timer.isRunning(), timer.getTime());
    }
    public static Main getInstance() {
        return instance;
    }
    public Timer getTimer() { return timer; }
}
