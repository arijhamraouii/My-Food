package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Adresse;
import com.example.demo.repository.AdresseRepository;


@Service
public class ServiceAdresse implements IServiceAdresse{
	@Autowired
	AdresseRepository adresseRepository;
	@Override
	public List<Adresse> findAvailableRestaurants(String ville) {
		return adresseRepository.findByVille(ville);
	}
}
