package com.cutomer.excption;

public class CustomerNotFound extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1174344314751849978L;

	public CustomerNotFound(String msg) {
		super(msg);
		
	}


	
}
