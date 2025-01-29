package com.sep.client;

import java.util.Set;

import com.sep.controller.PlayerController;
import com.sep.entity.Player;

public class PlayerClient {
	public static void main(String[] args) {
		PlayerController controller = new PlayerController();
		Set<Player> db = controller.getAllPlayercontroller();
		
		for (Player player : db) {
			System.out.println(player);
		}
		
		System.out.println("------------------------");
		
		Set<Player> db1 = controller.getteamnamecontroller("RCB");
		
		System.out.println("----------------------------SSS");
		
		for (Player player : db1) {
			System.out.println(player);
		}
		
		
		
	}


	}


