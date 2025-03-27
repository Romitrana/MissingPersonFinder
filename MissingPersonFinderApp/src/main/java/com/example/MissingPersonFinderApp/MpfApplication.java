package com.example.MissingPersonFinderApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController() 
public class MpfApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpfApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot(){ 
		return "Hello World!";
	}

}
