package com.verizontraining.restapidemo.models;


public class Player {

	private String name;
	private String clubName;
	private String position;
	@Override
	public String toString() {
		return "Player [name=" + name + ", clubName=" + clubName + ", position=" + position + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
