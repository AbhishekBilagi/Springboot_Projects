package com.contact.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/api")
@CrossOrigin(value="http://localhost:4200")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	ContactController(ContactService contactService){
		this.contactService=contactService;
	}
	
	@GetMapping("/contacts")
	public List<Contact> findAll() {
		
		return contactService.findAll();
		
	}
	@GetMapping("/contacts/{id}")
	public Optional<Contact> findById(@PathVariable int id) {
		
		return contactService.findById(id);
		
	}
	@PostMapping("/contacts")
	public Contact save(@RequestBody Contact contact) {
		
	  Contact c=contactService.save(contact);
	   System.out.println("Contact Add successfully");
	   return c;
		
	}
	
	@PutMapping("/contacts/{id}")
		public Contact update(@RequestBody Contact contact,@PathVariable int id) {
			
			  Contact c=contactService.save(contact);
			   System.out.println("Contact updated successfully");
			   return c;
				
	  }
	
	@DeleteMapping("contact/delete/{id}")
	public String delete(@PathVariable int id) {
		
		contactService.delete(id);
		
		return "Deleted with id"+id;
		
	}
}
	

