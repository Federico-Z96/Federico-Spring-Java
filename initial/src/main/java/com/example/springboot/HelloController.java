package com.example.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello Word";
	}

	@GetMapping("/greeting")
	public ResponseEntity<String> greeting() {
		return ResponseEntity.ok("200 Ok");
	}

}
