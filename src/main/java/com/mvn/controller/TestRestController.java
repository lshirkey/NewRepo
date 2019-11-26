package com.mvn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	
	
	@GetMapping("/welcome")
	public String hello() {
		return "Rest Respone";
	}
}
