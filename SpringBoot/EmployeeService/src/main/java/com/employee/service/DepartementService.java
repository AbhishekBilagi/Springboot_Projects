package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.model.Department;

@Service
public interface DepartementService {
	public List<Department> findAll();
	public Department save(Department dept);
}
