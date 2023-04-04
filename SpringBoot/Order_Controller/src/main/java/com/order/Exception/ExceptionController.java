package com.order.Exception;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {


	@ExceptionHandler(OrderNotFound.class)
	public ResponseEntity<ErrorInfo> exceptionController(RuntimeException ex){
		ErrorInfo error=new ErrorInfo();
		
		error.setErrorMessage(ex.getMessage());
		error.setTimeStamp(LocalDateTime.now());
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ErrorInfo>(error,HttpStatus.NOT_FOUND);
	}
}
