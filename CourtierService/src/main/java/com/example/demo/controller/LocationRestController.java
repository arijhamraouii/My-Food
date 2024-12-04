package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;
import com.example.demo.service.IServiceLocation;

@RestController
public class LocationRestController {
	@Autowired
	Environment environment;
	@Autowired
	IServiceLocation Slocation;
	
	@PutMapping("/location/{id}")
	public ResponseEntity<Location> changeLocation(@RequestBody Location location, @PathVariable("id") int id) {
		Location update = Slocation.updateLocation(location, id);
        if (update != null) {
            return new ResponseEntity<>(update, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	@GetMapping("/test")
	public String test()
	{
		return "test from :"+environment.getProperty("local.server.port");
	}
}
