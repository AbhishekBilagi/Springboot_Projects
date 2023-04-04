package com.jsontodb;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jsontodb.entity.Info;
import com.jsontodb.entity.Users;
import com.jsontodb.service.UserService;
import com.jsontodb.service.UserServiceimpl;


@SpringBootApplication
public class JsonToDbApplication implements CommandLineRunner{

	@Autowired
	public UserService userService;
	public static void main(String[] args) {
		System.out.println("Started Main method");
		SpringApplication.run(JsonToDbApplication.class, args);
		System.out.println("Ended Main method");
	}
	/*@Bean
	CommandLineRunner runner(UserServiceimpl userService){
	    return args -> {
			
			try {
				
				List<Users> userList = new ArrayList<>();
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				HttpClient client = HttpClient.newHttpClient();
				HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://reqres.in/api/users?page=2"))
						.build();
				HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
				System.out.println("response : " + gson.toJson(httpResponse.body()));

				Info fromJson = gson.fromJson(httpResponse.body(), Info.class);
			     userList.addAll(fromJson.getData());
				System.out.println("size :"+userList.size());
				  if(userList != null) {
		        	  userService.saveAll(userList);
		           }
				//return fromJson.getData();
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
	    };*/
	
	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("Started CommandLineRunner");
			
			List<Users> userList = new ArrayList<>();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://reqres.in/api/users?page=2"))
					.build();
			HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			System.out.println("response : " + gson.toJson(httpResponse.body()));

			Info fromJson = gson.fromJson(httpResponse.body(), Info.class);
		     userList.addAll(fromJson.getData());
			System.out.println("size :"+userList.size());
			  if(userList != null) {
	        	  userService.saveAll(userList);
	           }
			
		} catch (IOException e){
			System.out.println("Unable to save users: " + e.getMessage());
		}
		
	}

}
