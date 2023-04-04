package com.cutomer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cutomer.excption.CustomerNotFound;
import com.cutomer.model.Customer;
import com.cutomer.repo.CustomerRepository;

@Service
public class ServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;
	@Override
	public Customer save(Customer customer) {
		
		return repo.save(customer);
	}

	@Override
	public List<Customer> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Customer findById(int id) {
		Optional<Customer> customer=repo.findById(id);
		if(customer.isEmpty()) {
			throw new CustomerNotFound("Customer Not found");
		}
		return customer.get();
	}

}
