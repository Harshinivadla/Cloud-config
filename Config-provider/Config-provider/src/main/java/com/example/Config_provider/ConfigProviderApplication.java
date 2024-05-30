package com.example.Config_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController

public class ConfigProviderApplication {

	@GetMapping("/hello")
	public String hello(){
		return "Hello Harshini";
	}

	@GetMapping("/names")
    public List<String> names(){
		List<String> names = Arrays.asList("Harshini", "Harshu");
		return names;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigProviderApplication.class, args);
	}
}

