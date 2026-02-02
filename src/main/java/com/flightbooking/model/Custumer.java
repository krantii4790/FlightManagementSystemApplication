package com.flightbooking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cust_data")
public class Custumer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Arrival")
	private String arrival;
	@Column(name="Depature")
	private String depature;
	@Column(name="Duration")
	private int duration;
	@Column(name="Fare")
	private int fare;
	public Custumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Custumer(int id, String arrival, String depature, int duration, int fare) {
		super();
		this.id = id;
		this.arrival = arrival;
		this.depature = depature;
		this.duration = duration;
		this.fare = fare;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDepature() {
		return depature;
	}
	public void setDepature(String depature) {
		this.depature = depature;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	
	
}
