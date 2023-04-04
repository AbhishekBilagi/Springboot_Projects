package com.foodcenter.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncrypt {

	private static BCryptPasswordEncoder passwordencoder=null;
	
	
	
	private PasswordEncrypt() {
		
	}
	
	
	public static BCryptPasswordEncoder encrypt() {
		
		if(passwordencoder==null) {
			passwordencoder=new BCryptPasswordEncoder();
		}
		return passwordencoder;
	}
	
}
