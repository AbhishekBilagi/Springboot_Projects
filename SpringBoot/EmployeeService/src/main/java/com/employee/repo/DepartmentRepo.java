package com.employee.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.employee.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepositoryImplementation<Department, Integer> {

}
