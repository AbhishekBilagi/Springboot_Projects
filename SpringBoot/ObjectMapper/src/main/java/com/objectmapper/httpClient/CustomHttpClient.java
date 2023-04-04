package com.objectmapper.httpClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.objectmapper.dto.Info;
import com.objectmapper.dto.UserDTO;
import com.objectmapper.service.UserService;
import com.objectmapper.service.UserServiceimpl;

@Component
public class CustomHttpClient {

	
	public String getHttpCall() {
		try {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://reqres.in/api/users?page=2")).build();
			HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			System.out.println("response : "+gson.toJson(httpResponse.body()));
			
			Info fromJson = gson.fromJson(httpResponse.body(), Info.class);
		    
			System.out.println(gson.toJson(fromJson));
			System.out.println(fromJson.getData());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Hello";
	}

}
