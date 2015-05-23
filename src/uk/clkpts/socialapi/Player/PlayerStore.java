package uk.clkpts.socialapi.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class PlayerStore {
	// List off all Active players
	ArrayList<UUID> player_list = new ArrayList<UUID>();
	
	// Friend Data For Active Players
	HashMap<UUID, ArrayList<UUID>> player_friends = new HashMap<UUID, ArrayList<UUID>>();
	
	// 
	
}
