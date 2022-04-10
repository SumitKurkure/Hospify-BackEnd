package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Patient;
import com.example.service.PatientServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/profile")
public class ProfileController 
{
	@Autowired
	private PatientServiceImpl patientService;
	
	@GetMapping("/patient/{username}")
    public Patient getPatientDetails(@PathVariable String username, Patient patient)
	{
		System.out.println("in profile mapping");
        List<Patient> patientList = patientService.getPatientDetails();
              
        for(Patient patientObj : patientList)
        {
        	if(patientObj.getUsername().equals(username))
        	{
        		return patientObj;
        	}
        }
		return null;
    }
	
	
	@PostMapping("/patient/update/{username}")
	public String updatePatientDetaString(@PathVariable String username,@RequestBody Patient patient)
	{
		System.out.println("in update profile mapping");
        List<Patient> patientList = patientService.getPatientDetails();
         

        for(Patient patientObj : patientList)
        {
        	System.out.println("in for");
        	if(patientObj.getUsername().equals(username))
        	{
        		System.out.println("in if");
        		patientObj.setAddress(patient.getAddress());
        		patientObj.setAge(patient.getAge());
        		patientObj.setGender(patient.getGender());
        		patientObj.setName(patient.getName());
        		patientObj.setEmail(patient.getEmail());
        		patientObj.setBloodgroup(patient.getBloodgroup());
        		patientObj.setMobno(patient.getMobno());
        		System.out.println("set end ");
        		patientService.updateProfilePatient(patientObj);
        		return "update";
        	}
        }
     
		return null;
	}
}
