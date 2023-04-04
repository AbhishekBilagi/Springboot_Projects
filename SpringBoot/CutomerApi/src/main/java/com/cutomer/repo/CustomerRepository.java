package com.cutomer.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cutomer.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
