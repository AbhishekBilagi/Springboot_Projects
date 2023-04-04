package com.cutomer.excption;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cutomer.model.Customer;
import com.cutomer.model.ErrorInfo;

@RestControllerAdvice
public class CustomerExcptionHandler {

	@ExceptionHandler(CustomerNotFound.class)
	public ResponseEntity<ErrorInfo> customerExcptionHandler(Exception ex) {
		
		ErrorInfo error=new ErrorInfo();
		error.setSerrorMessage(ex.getMessage());
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setTimeStamp(LocalDate.now());
		return new ResponseEntity<>(error,HttpStatus.CREATED);
	}
}
