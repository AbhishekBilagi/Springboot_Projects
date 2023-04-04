package com.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repo.EmployeeRepo;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public List<Employee> findAll() {
		
		 List<Employee> emp=repo.findAll();
		return emp;
	}

	@Override
	public Employee save(Employee emp) {
		
		return repo.save(emp);
	}


}
