package de.tempoo50.rpg.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class RespawnFile {
	
	public static void loadrespwn() {	
		
		File file = new File("plugins//RPG//Respawn.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		config.addDefault("Respawn.Pig", 60);
		config.addDefault("Respawn.Cow", 60);
		config.addDefault("Respawn.Zombie", 60);
		config.addDefault("Respawn.Witch", 60);
		config.addDefault("Respawn.Skelett", 180);
		config.addDefault("Respawn.Spider", 60);
		config.addDefault("Respawn.Giant", 60);
		
		config.options().copyDefaults(true);
		
		try {
			config.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
