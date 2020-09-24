package com.verizontraining.restapidemo.requestPOJO;

import org.springframework.lang.NonNull;

public class PlayerRequest {

	private String name;
	private String clubName;
	private String position;
	private String country;
	
	@Override
	public String toString() {
		return "PlayerRequest [name=" + name + ", clubName=" + clubName + ", position=" + position + ", country="
				+ country + "]";
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
