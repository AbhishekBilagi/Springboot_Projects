package com.order.service;

import java.util.List;
import java.util.Optional;

import com.order.model.Order;

public interface OrderService {

	public Order createOrder(Order order);
	
	public List<Order> getAll();
	
	public Optional<Order> getOrderById(int id);
	
}
