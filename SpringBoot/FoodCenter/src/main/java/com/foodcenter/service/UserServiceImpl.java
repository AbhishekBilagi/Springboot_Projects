package com.foodcenter.service;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.foodcenter.exception.ApplicationException;
import com.foodcenter.model.PasswordEncrypt;
import com.foodcenter.model.User;
import com.foodcenter.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	@Autowired
	private EmailSenderService mailService;
	
	String otp;
	String email;

	Random random = new Random(1000);

	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Override
	public User save(User user) {

		// encrypting password

		String password = passwordEncoder.encode(user.getPassword());
		user.setPassword(password);

		System.out.println(user);
		return repo.save(user);

	}

	@Override
	public List<User> getUser() throws ApplicationException {

		return repo.findAll();
	}

	@Override
	public User findByEmailAndPassword(String email, String password) {

		return repo.findByEmailAndPassword(email, password);
	}

	@Override
	public User findByEmail(String email) {

		return repo.findByEmail(email);
	}

	@Override
	public String sendMail(String toMail, String body, String subject) {
		mailService.sendEmail(toMail, body, subject);
		return "mail sent....";
	}

	@Override
	public String genrateOTP(String mail) {

		// Random OTP genrate
		otp = Integer.toString(random.nextInt(999999));
		User user = repo.findByEmail(mail);
		
		if (user != null) {
			this.sendMail(user.getEmail(), "OTP: " + otp, "OTP Genrated");
			email=user.getEmail();
			return "We have sent OTP to your email";
		} else {
			return "you have entered wrong email !!";
		}
	}

	@Override
	public String verifyEmail(String OTP) {
		
        if(otp.equals(OTP)) {
           return "email is verified !!";
        }
        else {
           return "you have entered wrong OTP !!";
        }
	}
	@Override
	public String newPassword(String newPassword){
		
		User user=repo.findByEmail(email);
		
		if(user!=null) {
			String password = passwordEncoder.encode(newPassword);
			user.setPassword(password);
			repo.save(user);
			return "new password successfully created";
		}
		else {
			return "you have entered wrong email !!";
		}

	}

}
