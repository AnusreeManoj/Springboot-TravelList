package com.webapp.demo.Travelapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TravelClass {
	
	@Id
	private int travelId;
	private String travelName;
	private String travelDescription;
	public int getId() {
		return travelId;
	}
	public void setId(int travelId) {
		this.travelId = travelId;
	}
	public String getName() {
		return travelName;
	}
	public void setName(String travelName) {
		this.travelName = travelName;
	}
	public String getDescription() {
		return travelDescription;
	}
	public void setDescription(String travelDescription) {
		this.travelDescription = travelDescription;
	}
	
	
	
}