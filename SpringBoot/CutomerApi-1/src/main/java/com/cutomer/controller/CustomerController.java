package com.cutomer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cutomer.model.Customer;
import com.cutomer.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> save( @RequestBody @Valid Customer customer) {
		
	  return new ResponseEntity<Customer>(service.save(customer),HttpStatus.CREATED);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> gstAll() {
		
	  return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> findById(@PathVariable int id) {
		
	Customer customer=service.findById(id);
		
		return new ResponseEntity<>(customer,HttpStatus.OK);
	 
	}
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
}
