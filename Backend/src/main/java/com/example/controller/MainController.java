package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin("https://localhost:3000")
@RequestMapping("/api")
public class MainController
{
	@GetMapping("/patient/login")
	public Object patientLogin()
	{
		
	}
	@GetMapping("/doctor/login")
	public Object doctorLogin()
	{
		
	}
	
}
