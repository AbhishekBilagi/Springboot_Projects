package com.contact.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.model.Contact;



public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
