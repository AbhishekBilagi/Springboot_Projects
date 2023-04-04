package com.cutomer.service;

import java.util.List;

import com.cutomer.model.Customer;

public interface CustomerService {
   
	public Customer save(Customer customer);
	
	public List<Customer> getAll();
	
	public Customer findById(Customer customer);
}
