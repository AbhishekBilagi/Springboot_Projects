package com.order.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Order;
import com.order.service.OrderService;

@RestController
@RequestMapping("/api")
@Validated
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping(value="/order")
	public ResponseEntity<Order> createOrder(@RequestBody @Valid Order order){
		
	 return new ResponseEntity<Order>(service.createOrder(order),HttpStatus.CREATED);
	}
	
	@GetMapping(value="/orders")
	public ResponseEntity<List<Order>> getAll(){
		return new ResponseEntity<List<Order>>(service.getAll(),HttpStatus.OK);
	}
	
	@GetMapping(value="/order/{id}")
	public ResponseEntity<Order> getById(@PathVariable int id){
		Optional<Order> order=service.getOrderById(id);
		return new ResponseEntity<>(order.get(),HttpStatus.OK);
	}

}
