package com.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.model.Contact;
import com.Demo.repo.contactrepo;

@RestController
@RequestMapping("/api")
public class ContactController {
	
	@Autowired
	private contactrepo repo;
	
	@PostMapping("/contact")
	public Contact save (@RequestBody Contact contact) {
		
		return repo.save(contact);
	}

}
