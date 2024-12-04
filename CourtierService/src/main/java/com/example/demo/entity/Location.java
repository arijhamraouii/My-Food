package com.example.demo.entity;
import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity

public class Location implements Serializable{
	private static final long serialVersionUID =1L;
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private float Longitude;
	
	private float Latitude;

	public Location(float longitude, float latitude) {
		super();
		Longitude = longitude;
		Latitude = latitude;
	}

	public float getLongitude() {
		return Longitude;
	}

	public void setLongitude(float longitude) {
		Longitude = longitude;
	}

	public float getLatitude() {
		return Latitude;
	}

	public void setLatitude(float latitude) {
		Latitude = latitude;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "LineItems [id=" + id + ", Longitude=" + Longitude + ", Latitude=" + Latitude + "]";
	}
	
}
