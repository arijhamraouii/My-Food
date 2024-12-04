package com.example.demo.entity;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class LineItems implements Serializable{
	private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private Long menuId;
    private Long ticketId;
    
    
	public LineItems(Long id, int quantity, Long menuId, Long ticketId) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.menuId = menuId;
		this.ticketId = ticketId;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Long getMenuId() {
		return menuId;
	}


	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}


	public Long getTicketId() {
		return ticketId;
	}


	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "LineItems [id=" + id + ", quantity=" + quantity + ", menuId=" + menuId + ", ticketId=" + ticketId + "]";
	}
    
	
}
