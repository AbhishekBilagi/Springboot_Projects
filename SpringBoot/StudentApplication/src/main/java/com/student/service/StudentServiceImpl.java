package com.student.service;

import java.lang.StackWalker.Option;
import java.rmi.StubNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.exception.StudentNotfoundExcpetion;
import com.student.model.Student;
import com.student.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentRepository repo;
	@Override
	public ResponseEntity<Student> save(Student stu) {
		
		 Student temp=repo.save(stu);
		return new ResponseEntity<Student>(temp, HttpStatus.CREATED);
	}
	@Override
	public ResponseEntity<Student> findById(int id) {
		Optional<Student> student =repo.findById(id);
		if(student.isEmpty()) {
			throw new StudentNotfoundExcpetion("Student not found "+HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(student.get(), HttpStatus.OK);
	}
	@Override
	public ResponseEntity<List<Student>> findAll()  {
		
		List<Student> response=repo.findAll();
		if(response.isEmpty()) {
			throw new StudentNotfoundExcpetion("Student not found "+HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	@Override
	public ResponseEntity<Student> updateById(Student stu, int id) {
	   if(repo.existsById(id)) {
		   Student response=repo.findById(id).get();
		   response.setName(stu.getName());
		   response.setEmail(stu.getEmail());
		   response.setAddress(stu.getAddress());
		   response.setCity(stu.getCity());
		   Student save=repo.save(stu);
		   return new ResponseEntity<Student>(save,HttpStatus.CREATED);
	   }else {
		   throw new StudentNotfoundExcpetion("Student not found"+HttpStatus.NOT_FOUND);
	   }
		
		
	}
	@Override
	public ResponseEntity<String> deleteById(int id) {
		 
		Optional<Student> student =repo.findById(id);
		if(student.isEmpty()) {
			throw new StudentNotfoundExcpetion("Student not found"+HttpStatus.NOT_FOUND);
		}
		repo.deleteById(id);
		return new ResponseEntity<>("Deleted successfully",HttpStatus.OK);
	}
	

}
