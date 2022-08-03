package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("hello")
	public String hello() {
		return "hello world";
		
		
	}
	
	
	@GetMapping("/hello/one")
	public String hellocloud() {
		return "Hello Cloud";
		
	}

}
