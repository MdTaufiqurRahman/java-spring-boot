package com.example.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/home")
	public String home() {
		return "Hello world.";
	}
	
	@GetMapping("/hi")
	public String Testing() {
		return "Hi";
	}

}
