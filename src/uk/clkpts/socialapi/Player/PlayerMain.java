package uk.clkpts.socialapi.Player;

import java.util.UUID;


public class PlayerMain {
	
	
	
	public PlayerMain(){
	}
	
	public PlayerData getDataFromUUID(UUID player){
		return new PlayerData(player, this);
	}
	
	public PlayerStore getFromUUID(UUID player){
		return null;
		
	}
	
}
