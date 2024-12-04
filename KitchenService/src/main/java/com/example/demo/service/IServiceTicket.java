package com.example.demo.service;

import com.example.demo.entity.Ticket;

public interface IServiceTicket {
public boolean createTicket(Ticket ticket);
	
	public Ticket acceptTicket(int id);
	
	public Ticket readyForPickUp(int id);


}
