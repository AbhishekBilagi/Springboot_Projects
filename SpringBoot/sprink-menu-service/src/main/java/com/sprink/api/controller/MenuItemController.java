package com.sprink.api.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sprink.api.exception.MenuItemNotFoundException;
import com.sprink.api.model.MenuItem;
import com.sprink.api.model.ResponseMessage;
import com.sprink.api.service.MenuItemService;

@RestController
@RequestMapping("/api")
public class MenuItemController {

	@Autowired
	private MenuItemService service;
	
	@PostMapping("/items")
	public ResponseMessage createMenuItem(@RequestBody MenuItem menuitem) throws URISyntaxException  {
		
		ResponseMessage response=new ResponseMessage();
		menuitem=service.save(menuitem);
		response.setStatus("Success");
		response.setMessage("Item Added Successfully");
		//return (ResponseEntity<ResponseMessage>) ResponseEntity.created(new URI("http://localhost:8080/sprint/api/item/"+menuitem.getId()));
		return response;
	}
	
	@GetMapping("/items")
	public List<MenuItem> getAll(){
		return service.getAll();
	}
	@GetMapping("/{id}")
	public MenuItem getMenuById(@PathVariable int id) throws MenuItemNotFoundException{
		
		service.getMenuById(id);
		return null;
	}
	@PutMapping("items/{id}")
	public MenuItem updateMenuById(@RequestBody MenuItem menuitem ,@PathVariable int id) throws MenuItemNotFoundException{
		return service.updateMenuById(menuitem, id);
	}
	
	@DeleteMapping("/{id}")
	public MenuItem DeleteMenuById(@PathVariable int id){
		return null;
	}
	
}
