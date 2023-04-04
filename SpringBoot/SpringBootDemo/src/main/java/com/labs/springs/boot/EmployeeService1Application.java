package com.labs.springs.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan
//@Configuration
//@EnableAutoConfiguration
public class EmployeeService1Application implements CommandLineRunner {
	
	@Autowired
	ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeService1Application.class, args);
		System.out.println("Hello word");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(ctx.getBeanDefinitionCount());
		
		for(String beanName:ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
		
	}

}
