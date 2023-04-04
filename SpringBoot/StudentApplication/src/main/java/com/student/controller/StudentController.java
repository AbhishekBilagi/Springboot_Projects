package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
    @Autowired
    private StudentService service;
   
   @PostMapping("/student")
   public ResponseEntity<Student> save(@RequestBody Student stu) {
	   return service.save(stu);
   }
   
   @GetMapping("/students")
   public ResponseEntity<List<Student>> findAll(){
	   return service.findAll();
   }
   @GetMapping("/student/{id}")
   public ResponseEntity<Student> findById(@PathVariable("id") int id){
	   return service.findById(id);
   }
   
   @PutMapping("/student/{id}")
   public ResponseEntity<Student> updateById(@PathVariable("id") int id,@RequestBody Student stu){
	   return service.updateById(stu, id);
   }
   @DeleteMapping("/student/{id}")
   public ResponseEntity<String> updateById(@PathVariable("id") int id){
	   return service.deleteById(id);
   }
   
}
