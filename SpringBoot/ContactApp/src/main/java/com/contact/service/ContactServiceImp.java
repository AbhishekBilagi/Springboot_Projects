package com.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.model.Contact;
import com.contact.repo.ContactRepository;

@Service
public class ContactServiceImp implements ContactService{

	@Autowired
	private ContactRepository repo;
	 
	@Override
	public Contact save(Contact contact) {
		
		
		return repo.save(contact);
		
	}

	@Override
	public List<Contact> findAll() {
		
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		
	      repo.deleteById(id);
	}

	@Override
	public Optional<Contact> findById(int id) {
		
		Optional<Contact> contact=repo.findById(id);
		return contact;
	
	}

}
