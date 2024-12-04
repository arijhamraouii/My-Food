package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuRepository;


@Service
public class ServiceMenu implements IServiceMenu{
	@Autowired
	MenuRepository menuRepository;
	
	@Override
	public List<Menu> findRestaurantMenu(String mot) {
		return menuRepository.findByNom(mot);
	}
}
