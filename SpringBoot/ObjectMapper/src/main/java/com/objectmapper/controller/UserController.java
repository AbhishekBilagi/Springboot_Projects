package com.objectmapper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.objectmapper.entity.User;
import com.objectmapper.service.UserServiceimpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceimpl userService;

   
    @GetMapping("/list")
    public List<User> findAll() {
        return userService.findAll();
    }
    
    @GetMapping(value = "/api/call")
    public String getApiData() {
    	return userService.saveApiData();
    }

}
