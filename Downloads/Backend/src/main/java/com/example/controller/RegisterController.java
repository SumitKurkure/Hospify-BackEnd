package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Patient;
import com.example.service.PatientServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/register")
public class RegisterController
{
	@Autowired
	private PatientServiceImpl patientService;
	
	@PostMapping("/patient")
	public String registerPatient(@RequestBody Patient patient)
	{
		patientService.registerPatient(patient);
		return "success";
	}

}
