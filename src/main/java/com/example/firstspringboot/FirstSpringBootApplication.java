package com.example.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

}
@RestController
class TestingRest{
	@GetMapping("/")
	String display(){
		return "Hello";
	}
}
