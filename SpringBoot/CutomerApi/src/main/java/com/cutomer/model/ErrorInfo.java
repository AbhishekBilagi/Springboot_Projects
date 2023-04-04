package com.cutomer.model;

import java.time.LocalDate;

public class ErrorInfo {

	private String errorCode;
	private String serrorMessage;
	private LocalDate timeStamp;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
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
