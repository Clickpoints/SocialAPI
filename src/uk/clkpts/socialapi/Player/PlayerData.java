package uk.clkpts.socialapi.Player;

import java.util.HashMap;
import java.util.UUID;

public class PlayerData {
	PlayerMain main;
	
	public PlayerData(UUID player, PlayerMain main){
		this.main = main;
	}
	
	public HashMap<String, String> getData(){
		return null;
	}
}
