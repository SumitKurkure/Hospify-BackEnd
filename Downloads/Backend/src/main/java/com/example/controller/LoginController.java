package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Patient;
import com.example.service.PatientServiceImpl;

@CrossOrigin(origins  = "http://localhost:3000")
@RestController
@RequestMapping("/login")
public class LoginController
{

	@Autowired
	private PatientServiceImpl patientService;
	
	
	@PostMapping("/patient")
	public String loginAuthentication(@RequestBody Patient patient)
	{ 
		System.out.println("Fired login controller");
		
		List<Patient> patientList = patientService.findByUsernameAndPassword(patient);
		
		
		for(Patient patientObj : patientList)
		{
			if(patientObj.getUsername().equals(patient.getUsername()) && patientObj.getPassword().equals(patient.getPassword()))
			{
				return "valid";
			}
		}
		return "invalid";
	}
	
//	@PostMapping("/doctor")
	
}
