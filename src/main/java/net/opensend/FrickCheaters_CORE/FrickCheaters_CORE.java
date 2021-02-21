package net.opensend.FrickCheaters_CORE;

import org.bukkit.plugin.java.JavaPlugin;

public class FrickCheaters_CORE extends JavaPlugin {
    public static final String version = "1.0";
    public static final long apiVersion = 1;

    @Override
    public void onEnable () {
        getLogger().info(
                "\n------------------------------\n\n" +
                        "Loaded FrickCheaters CORE (v" + version + ")\n" +
                        "Copyright (C) 2021  OpenSend Technologies & Ollie Killean\n" +
                        "This program comes with ABSOLUTELY NO WARRANTY.\n" +
                        "This is free software, and you are welcome to redistribute\n" +
                        "it under certain conditions; https://bit.ly/38makeR\n\n" +
                        "------------------------------\n"
        );
    }

    @Override
    public void onDisable () {
        getLogger().warning("Disable request received: The server is either restarting, or a plugin reload has been initiated.");
        getLogger().warning("Even though this plugin DOES support reloading, other plugins, including FrickCheaters, may have issues after reloads.");
    }
}
