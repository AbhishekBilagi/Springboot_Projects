package com.objectmapper.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.objectmapper.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}