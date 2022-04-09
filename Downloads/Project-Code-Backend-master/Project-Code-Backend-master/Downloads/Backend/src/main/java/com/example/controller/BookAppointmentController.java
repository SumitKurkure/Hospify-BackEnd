package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.HospitalDao;
import com.example.pojo.Hospital;

@RestController
@CrossOrigin("*")
@RequestMapping("/bookappointment")
public class BookAppointmentController 
{
	
	@Autowired
	private HospitalDao hospDao;
	
	@GetMapping("/showhospital/{cityName}")
	public List<Hospital> getHospitalByCity(@PathVariable String cityName,Hospital hospital)
	{
		System.out.println("in hosp controller");
		return hospDao.getAllHospital(cityName);
	}
	
	
}