package com.sep.controller;

import java.util.Set;

import com.sep.entity.Player;
import com.sep.service.PlayerService;

public class PlayerController {

	PlayerService service = null;

	public Set<Player> getAllPlayercontroller() {

		service = new PlayerService();
		Set<Player> db = service.getAllplayersservice();
		return db;
	}

	public Set<Player> getteamnamecontroller(String ch) {
		service = new PlayerService();
		Set<Player> db1 = service.getteamnameservice(ch);
		return db1;
	}
}



