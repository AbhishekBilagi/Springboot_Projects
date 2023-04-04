package com.sprink.api.exception;

public class MenuItemNotFoundException extends Exception {
	
	public MenuItemNotFoundException() {
		super();
	}

	public MenuItemNotFoundException(String message) {
		super(message);
	}

	public MenuItemNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
