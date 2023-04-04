package com.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.Exception.OrderNotFound;
import com.order.model.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repo;
	
	@Override
	public Order createOrder(Order order) {
		
		return repo.save(order);
	}

	@Override
	public List<Order> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Optional<Order> getOrderById(int id) {
		
		Optional<Order> order=repo.findById(id);
		if(order.isEmpty()) {
			throw new OrderNotFound("Order not found with id:"+id);
		}
		
		return order;
	}

}
