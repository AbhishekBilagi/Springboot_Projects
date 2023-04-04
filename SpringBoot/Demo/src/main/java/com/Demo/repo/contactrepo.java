package com.Demo.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.Demo.model.Contact;

public interface contactrepo extends JpaRepositoryImplementation<Contact, Integer> {

}
