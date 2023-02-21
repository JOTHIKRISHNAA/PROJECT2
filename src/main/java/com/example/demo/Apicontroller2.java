package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller2 {
	@GetMapping("/hello")
	   public String hello() {
		return "Hello world";
	}


}
