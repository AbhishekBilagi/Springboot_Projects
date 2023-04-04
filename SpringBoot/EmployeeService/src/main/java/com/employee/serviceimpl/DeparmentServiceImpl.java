package com.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Department;
import com.employee.repo.DepartmentRepo;
import com.employee.service.DepartementService;
@Service
public class DeparmentServiceImpl implements DepartementService {

	@Autowired
	private DepartmentRepo repo;
	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Department save(Department dept) {
		
		return repo.save(dept);
	}

}
