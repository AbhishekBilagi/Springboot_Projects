package com.cutomer.model;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

public class ErrorInfo {

	private Integer errorCode;
	private String serrorMessage;
	private LocalDate timeStamp;
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public String getSerrorMessage() {
		return serrorMessage;
	}
	public void setSerrorMessage(String serrorMessage) {
		this.serrorMessage = serrorMessage;
	}
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}

	
}
