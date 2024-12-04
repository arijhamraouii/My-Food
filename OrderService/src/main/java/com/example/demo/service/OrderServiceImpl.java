package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderEntity;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	 @Autowired
	    private OrderRepository orderRepository;

	    public OrderEntity createOrder(OrderEntity order) {
	     //   order.setState("created");
	        return orderRepository.save(order);
	    }

	    public void cancelOrder(Long orderId) {
	        orderRepository.findById(orderId).ifPresent(order -> {
	            order.setState("canceled");
	            orderRepository.save(order);
	        });
	    }

	    public OrderEntity reviseOrder(Long orderId, OrderEntity revisedOrder) {
	        return orderRepository.findById(orderId).map(order -> {
	            order.setState(revisedOrder.getState());
	            order.setConsumerId(revisedOrder.getConsumerId());
	            order.setRestaurantId(revisedOrder.getRestaurantId());
	            return orderRepository.save(order);
	        }).orElse(null);
	    }
}
