package com.sboot.labs.rest.controller;



import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@RequestMapping(path="/orders" ,method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ResponseMessage> create() throws URISyntaxException {
		
		//return "order is created ";
		//ResponseMessage response=new ResponseMessage("Success","Order created");
		ResponseMessage response = new ResponseMessage("success", "Order created successfully");
		//ResponseEntity<ResponseMessage> res = ResponseEntity.created(new URI("http://localhost:8080/orders/1")).body(response);
		ResponseEntity<ResponseMessage> res1 = new ResponseEntity(response, HttpStatus.CREATED);
		return res1;
		
	}
	
	@PostMapping("/order")
	public ResponseMessage getMessage(@RequestBody ResponseMessage msg) {
		
		return msg;
	}
}
