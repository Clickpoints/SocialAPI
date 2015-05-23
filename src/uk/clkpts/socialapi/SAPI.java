package uk.clkpts.socialapi;

import java.util.HashMap;
import java.util.UUID;

import uk.clkpts.socialapi.GUI.GUIMain;
import uk.clkpts.socialapi.Party.PartyMain;
import uk.clkpts.socialapi.Player.PlayerMain;
import uk.clkpts.socialapi.Player.PlayerStore;

public class SAPI {
	
	// Importing
	Main plugin;
	PartyMain parties;
	GUIMain gui;
	PlayerMain player;
	
	// Abbreviation
	
	
	public SAPI(){
		parties = new PartyMain();
		player = new PlayerMain();
		gui = new GUIMain();
	}
	
	public HashMap<String, String> getPlayerData(UUID p){
		return player.getDataFromUUID(p).getData();
	}
	
	public PlayerStore getPlayer(UUID p){
		return player.getFromUUID(p);
	}
	
}
