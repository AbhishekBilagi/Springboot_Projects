package com.foodcenter.exception;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.foodcenter.model.ResponseMessage;


@ControllerAdvice
public class GenericExceptionHandler {
	
//	@ExceptionHandler(ConstraintViolationException.class)
//    public ResponseEntity<ResponseMessage> handleValidationException(ConstraintViolationException e) {
//        ResponseMessage response = new ResponseMessage();
//      
//        for(ConstraintViolation error : e.getConstraintViolations()) {
//        	response.setStatus("Failure");
//            response.setMessage("Validation Error: "+ error.getMessage());
//        }
//        
//        return ResponseEntity.internalServerError().body(response);
//    }
	
	@ExceptionHandler(ApplicationException.class)
	    public ResponseEntity<ResponseMessage> handleApplicationException(Exception e) {
	        ResponseMessage response = new ResponseMessage();
	        response.setStatus("Failure");
	        response.setMessage("App Error: " + e.getMessage());
	        return ResponseEntity.internalServerError().body(response);
	    }
}
