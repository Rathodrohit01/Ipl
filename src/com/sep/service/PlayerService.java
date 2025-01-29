package com.sep.service;

import java.util.HashSet;
import java.util.Set;

import com.sep.dao.PlayerDao;
import com.sep.entity.Player;

public class PlayerService {

	PlayerDao dao = null;

	public Set<Player> getAllplayersservice() {

		dao = new PlayerDao();
		Set<Player> db = dao.getAllplayers();
		return db;
	}

	public Set<Player> getteamnameservice(String ch) {

		dao = new PlayerDao();
		Set<Player> db = dao.getAllplayers();
		Set<Player> db1 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getTeamname().contains(ch)) {
				db1.add(p1);
			} else {
				System.out.println("Player is Not Present");
			}
		}
		return db1;
	}
}
