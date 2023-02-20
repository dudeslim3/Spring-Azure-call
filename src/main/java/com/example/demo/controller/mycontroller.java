package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
	
	
	@GetMapping("/hello1")
	public String getapi()
	{
		System.out.println("hello1");
		return "hello1 goodmorning";
	}

}
