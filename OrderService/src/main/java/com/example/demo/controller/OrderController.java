package com.example.demo.controller;
import org.springframework.core.env.Environment;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.OrderEntity;
import com.example.demo.service.OrderService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/orders")
public class OrderController {
	@Autowired
	Environment environment;
	@Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity order) {
    	OrderEntity createdOrder = orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.SC_CREATED).body(createdOrder);
    }

    @PutMapping("/{orderId}/cancel")
    public ResponseEntity<?> cancelOrder(@PathVariable Long orderId) {
        orderService.cancelOrder(orderId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<OrderEntity> reviseOrder(@PathVariable Long orderId, @RequestBody OrderEntity revisedOrder) {
    	OrderEntity updatedOrder = orderService.reviseOrder(orderId, revisedOrder);
        if (updatedOrder != null) {
            return ResponseEntity.ok(updatedOrder);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
    @GetMapping("test")
	public String test()
	{
		return "test from :"+environment.getProperty("local.server.port");
	}
}
