package com.sboot.labs.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class GreetingController {
  
	@RequestMapping("/greeting")
	//@ResponseBody
	public String greeting() {
		return "<h1>Hello</h1>";
	}
}
