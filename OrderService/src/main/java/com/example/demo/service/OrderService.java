package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderEntity;

@Service
public interface OrderService {
	OrderEntity createOrder(OrderEntity order);
	    void cancelOrder(Long orderId);
	    OrderEntity reviseOrder(Long orderId, OrderEntity revisedOrder);
	    
}
