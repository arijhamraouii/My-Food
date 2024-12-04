package com.example.demo.entity;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity

public class Ticket implements Serializable{
	private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String state;
    private Long restaurantId;
    private int preparingTime;
    private LocalDateTime pickedUpTime;
    
    
	public Ticket(Long id, String state, Long restaurantId, int preparingTime, LocalDateTime pickedUpTime) {
		super();
		this.id = id;
		this.state = state;
		this.restaurantId = restaurantId;
		this.preparingTime = preparingTime;
		this.pickedUpTime = pickedUpTime;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Long getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}


	public int getPreparingTime() {
		return preparingTime;
	}


	public void setPreparingTime(int preparingTime) {
		this.preparingTime = preparingTime;
	}


	public LocalDateTime getPickedUpTime() {
		return pickedUpTime;
	}


	public void setPickedUpTime(LocalDateTime pickedUpTime) {
		this.pickedUpTime = pickedUpTime;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", state=" + state + ", restaurantId=" + restaurantId + ", preparingTime="
				+ preparingTime + ", pickedUpTime=" + pickedUpTime + "]";
	}
	
	
	
}
