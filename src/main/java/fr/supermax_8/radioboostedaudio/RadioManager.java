package fr.supermax_8.radioboostedaudio;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.HashMap;

public class RadioManager {

    private HashMap<String, Radio> radioMap = new HashMap<>();

    public RadioManager(File config) {
        load(config);
    }

    public void load(File config) {
        radioMap.clear();
        FileConfiguration fc = YamlConfiguration.loadConfiguration(config);
        for (String s : fc.getConfigurationSection("radios").getKeys(false)) {
            radioMap.put(s, new Radio(
                    fc.getString("radios." + s + ".itemname"),
                    fc.getString("radios." + s + ".permission"),
                    fc.getDoubleList("radios." + s + ".frequencies").stream().mapToDouble(Double::doubleValue).toArray()
            ));
        }
    }


}