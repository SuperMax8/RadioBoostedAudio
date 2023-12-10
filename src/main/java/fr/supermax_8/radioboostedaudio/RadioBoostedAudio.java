package fr.supermax_8.radioboostedaudio;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class RadioBoostedAudio extends JavaPlugin {

    private static RadioBoostedAudio instance;
    private RadioManager manager;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        manager = new RadioManager(new File(getDataFolder(), "config.yml"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public RadioManager getManager() {
        return manager;
    }

    public RadioBoostedAudio getInstance() {
        return instance;
    }

}