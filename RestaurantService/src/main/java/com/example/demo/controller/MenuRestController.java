package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Menu;
import com.example.demo.service.IServiceMenu;

@RestController

public class MenuRestController {
	@Autowired
	IServiceMenu Smenu;
	
	@GetMapping("/menu")
    public ResponseEntity<List<Menu>> getOneParm(@RequestParam("mot") String mot) {
        List<Menu> menu = Smenu.findRestaurantMenu(mot);
        if (menu.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(menu, HttpStatus.OK);
    }
}
