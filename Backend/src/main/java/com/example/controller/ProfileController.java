package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Patient;
import com.example.service.PatientServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/dashboard/profile")
public class ProfileController 
{
	@Autowired
	private PatientServiceImpl patientService;
	
	@GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientDetails(@PathVariable int id)
	{
        Patient patient = patientService
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(employee);
    }
}
