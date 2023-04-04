package com.foodcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String toMail, String body, String subject) {

		SimpleMailMessage msg = new SimpleMailMessage();

		msg.setFrom("abhishekbilagi1998@gmail.com");
		msg.setTo(toMail);
		msg.setText(body);
		msg.setSubject(subject);
		
		mailSender.send(msg);
		
		System.out.println("Mail send....");

	}
}
