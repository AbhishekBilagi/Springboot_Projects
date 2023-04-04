package com.cutomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cutomer.model.Customer;
import com.cutomer.service.CustomerService;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {
		
	  return new ResponseEntity<Customer>(service.save(customer),HttpStatus.CREATED);
	}
	

}
