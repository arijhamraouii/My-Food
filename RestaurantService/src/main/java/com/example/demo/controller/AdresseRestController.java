package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Adresse;
import com.example.demo.service.IServiceAdresse;

@RestController

public class AdresseRestController {
	@Autowired
	IServiceAdresse Sadresse;
	
	@GetMapping("/adresse")
    public ResponseEntity<List<Adresse>> getOneParm(@RequestParam("ville") String ville) {
        List<Adresse> adresse = Sadresse.findAvailableRestaurants(ville);
        if (adresse.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(adresse, HttpStatus.OK);
    }
}
