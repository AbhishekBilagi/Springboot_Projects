package com.student.exception;

public class StudentNotfoundExcpetion extends RuntimeException{

	public StudentNotfoundExcpetion() {}
	
	public StudentNotfoundExcpetion(String  message) {
		super(message);
	}
}
