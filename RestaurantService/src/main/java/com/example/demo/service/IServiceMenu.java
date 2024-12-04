package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Menu;

public interface IServiceMenu {
	public List<Menu> findRestaurantMenu(String mot);

}
