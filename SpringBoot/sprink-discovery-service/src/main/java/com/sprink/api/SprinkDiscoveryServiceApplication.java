package com.sprink.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SprinkDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinkDiscoveryServiceApplication.class, args);
	}

}
