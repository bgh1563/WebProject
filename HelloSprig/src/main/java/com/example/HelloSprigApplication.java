package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloSprigApplication {
	
	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
	
	@RequestMapping("/")
	String demo() {
		return "데모 페이지에 접속 하셨습니다.";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloSprigApplication.class, args);
	}

}
