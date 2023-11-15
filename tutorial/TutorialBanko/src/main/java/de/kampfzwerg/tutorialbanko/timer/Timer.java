package de.kampfzwerg.tutorialbanko.timer;

import de.kampfzwerg.tutorialbanko.Main;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer {
    private boolean running;
    private int time;

    public Timer(boolean running, int time) {
        this.running = running;
        this.time = time;

        run();
    }

    public boolean isRunning() {
        return running;
    }
    public void setRunning(boolean running) {
        this.running = running;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public String formatTime(int timeInSeconds) {
        int weeks = (timeInSeconds % (86400 * 30)) / (86400 * 7);
        int days = (timeInSeconds % (86400 * 7)) / 86400;
        int hours = (timeInSeconds % 86400) / 3600;
        int minutes = (timeInSeconds % 3600) / 60;
        int seconds = timeInSeconds % 60;

        StringBuilder formattedTime = new StringBuilder();

        if (weeks > 0) {
            formattedTime.append(weeks).append("w ");
        }
        if (days > 0 || (weeks > 0 && days == 0)) {
            formattedTime.append(days).append("d ");
        }
        if (hours > 0 || (days > 0 && hours == 0) || (weeks > 0 && days == 0 && hours == 0)) {
            formattedTime.append(hours).append("h ");
        }
        if (minutes > 0 || (hours > 0 && minutes == 0) || (days > 0 && hours == 0 && minutes == 0) || (weeks > 0 && days == 0 && hours == 0 && minutes == 0)) {
            formattedTime.append(minutes).append("m ");
        }
        formattedTime.append(seconds).append("s");
        return formattedTime.toString().trim();
    }
    
    public void sendActionBar() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            String formattedTime = formatTime(getTime());
            if (!isRunning()) {
                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.RED +
                       "Timer pausiert bei: " + formattedTime));
                continue;
            }
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GREEN.toString() +
                    ChatColor.BOLD + formattedTime));
        }
    }

    private void run() {
        new BukkitRunnable() {
            @Override
            public void run(){
                sendActionBar();
                if (!isRunning()) {
                    return;
                }
                setTime(getTime() + 1);
            }
        }.runTaskTimer(Main.getInstance(), 20, 20);
    }
}
