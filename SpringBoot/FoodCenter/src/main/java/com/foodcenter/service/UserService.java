package com.foodcenter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodcenter.exception.ApplicationException;
import com.foodcenter.model.User;

@Service
public interface UserService {

	public User save(User user);
	
	public List<User> getUser() throws ApplicationException;
	
	public User findByEmailAndPassword(String email,String password);
	
	public User findByEmail(String email);
	
	public String sendMail(String toMail,String body,String subjcet);
	
	public String genrateOTP(String mail);

	public String verifyEmail(String OTP);
	
	public String newPassword(String password);
}
