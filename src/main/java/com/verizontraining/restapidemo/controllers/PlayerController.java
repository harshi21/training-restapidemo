package com.verizontraining.restapidemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizontraining.restapidemo.models.Player;
import com.verizontraining.restapidemo.requestPOJO.PlayerRequest;

@RestController
public class PlayerController {
	
	List<Player> players = new ArrayList<Player>();
	@GetMapping("/player")
	public Player getPlayer() {
		Player player = new Player();
		player.setName("Lionell Messi");
		player.setClubName("FC Barcelona");
		player.setPosition("RW");

		return player;
	}
	
	@GetMapping("/players")
	public List<Player> getPlayers(){
		return players;
	}
	
	@PostMapping("/player")
	public Player createPlayer( @RequestBody PlayerRequest pRequest) {
	    
		Player player = new Player();
		player.setName(pRequest.getName());
		player.setClubName(pRequest.getClubName());
		player.setPosition(pRequest.getPosition());
		players.add(player);
		return player;
	}
}
