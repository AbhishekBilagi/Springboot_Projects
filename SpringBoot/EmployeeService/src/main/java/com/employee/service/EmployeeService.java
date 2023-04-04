package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public interface EmployeeService {
     
	public List<Employee> findAll();
	public Employee save(Employee emp);
	
}
