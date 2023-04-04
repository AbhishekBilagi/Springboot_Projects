package com.student.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.student.model.Student;

public interface StudentService {

	public ResponseEntity<Student> save(Student stu);
	
	public ResponseEntity<Student> findById(int id);
	
	public ResponseEntity<List<Student>> findAll();
	
	public ResponseEntity<Student> updateById(Student stu,int id);
	
	public ResponseEntity<String>  deleteById(int id);
	
	

	

	
}
