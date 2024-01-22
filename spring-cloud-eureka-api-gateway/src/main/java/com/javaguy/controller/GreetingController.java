package com.javaguy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingController {
	
	@GetMapping("/gateway-greeting")
	public String greeting() {
		return "Greeting from gateway";
	}
}
