package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;


@Service
public class LocationServiceIm implements IServiceLocation{
	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location updateLocation(Location location, int id) {
		location.setId(id);
		locationRepository.save(location);
		return locationRepository.findById(id).get();
	}
}
