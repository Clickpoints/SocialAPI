package uk.clkpts.socialapi;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable(){
		Main plugin;
		System.out.println(ChatColor.AQUA + "SAPI: Initialising...");
		PluginManager pm = getServer().getPluginManager();
	    pm.registerEvents(this, this);
	    init();
	}
	
	public void onDisable(){
		System.out.println(ChatColor.AQUA + "SAPI: Disabling...");
	}
	
	public void init(){
		loadData();
	}
	
	public void loadData(){
		
	}
	
	public void saveData(){
		
	}
}
