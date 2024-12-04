package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Adresse;

public interface IServiceAdresse {
	public List<Adresse> findAvailableRestaurants(String ville);

}
