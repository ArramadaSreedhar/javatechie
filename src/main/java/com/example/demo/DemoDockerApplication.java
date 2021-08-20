package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerApplication {
	@GetMapping("/message")
	public String getMessage() {
		
		return "Welcome Sreedhar123";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}
