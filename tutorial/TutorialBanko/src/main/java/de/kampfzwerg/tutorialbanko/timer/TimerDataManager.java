package de.kampfzwerg.tutorialbanko.timer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import java.io.IOException;

public class TimerDataManager {
    private final File dataFile;
    private final FileConfiguration dataConfig;

    public TimerDataManager(File dataFolder) {
        // Initialize the data file and configuration
        dataFile = new File(dataFolder, "timerdata.yml");
        dataConfig = YamlConfiguration.loadConfiguration(dataFile);
    }

    public void saveTimerData(boolean isRunning, int seconds) {
        // Set timer data in the configuration
        dataConfig.set("timer.running", isRunning);
        dataConfig.set("timer.seconds", seconds);

        // Save the configuration to the file
        try {
            dataConfig.save(dataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Timer loadTimerData() {
        // Get timer data from the configuration
        boolean isRunning = dataConfig.getBoolean("timer.running", false); // Default value if not found
        int seconds = dataConfig.getInt("timer.seconds", 0); // Default value if not found

        return new Timer(isRunning, seconds);
    }
}
