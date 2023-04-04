package com.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;

@Service
public interface ContactService {

	public Contact save(Contact contact);

	public List<Contact> findAll();

	public void delete(int id);
	
	public Optional<Contact> findById(int id);

}
