package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Department;
import com.employee.service.DepartementService;

@RestController
@RequestMapping("/api")

public class DepartementController {
	
	@Autowired
	private DepartementService depts;
	
	@PostMapping("/dept")
	public Department save(@RequestBody Department dept) {
		
		return depts.save(dept);
	}
	@GetMapping("/depts")
	public List<Department> findAll(){
		return  depts.findAll();
	}
	

}
