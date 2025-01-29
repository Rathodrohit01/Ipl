package com.sep.dao;

import java.util.HashSet;
import java.util.Set;

import com.sep.entity.Player;



public class PlayerDao {
	public Set<Player> getAllplayers() {

		Set<Player> db = new HashSet<Player>();

		db.add(new Player(7, "Rohit Rathod  ", 85000, 350, "CSK"));
		db.add(new Player(01, "MS Dhooni  ", 46000, 120, "MI"));
		db.add(new Player(18, "Virat Kohli", 68000, 135, "RCB"));
		db.add(new Player(77, "sachin tendulkar", 4100, 110, "CSK"));
		db.add(new Player(13, "", 1200, 1200, "MI"));

		return db;
	}






	

}
