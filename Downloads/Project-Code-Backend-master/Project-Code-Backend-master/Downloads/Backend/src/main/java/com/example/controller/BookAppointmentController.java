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
//	@Autowired
//	private HospitalServiceImpl hospServImpl;
	
	@Autowired
	private HospitalDao hospDao;
	
	@GetMapping("/showhospital/{cityName}")
	public List<Hospital> getHospitalByCity(@PathVariable String cityName,Hospital hospital)
	{
		System.out.println("in hosp controller");
		return hospDao.getAllHospital(cityName);
	}
	
	
	
//	@GetMapping("/hospital/{cityName}")
//	public List<Hospital> getHospitalByCity(@PathVariable String cityName,Hospital hospital)
//	{
//		System.out.println("in hosp controller");
//		
////		List<Hospital> hospitalList = hospServImpl.getAllHospital(cityName);
////		
////		for(Hospital obj : hospitalList)
////		{
////			if(obj.getCity().equals(cityName))
////			{
////				return hospitalList;
////			}
////		}
//		return hospitalList;
//	}
//	@GetMapping("/showhospital/{cityName}")
//	public List<Hospital> showHospitalList(@PathVariable String cityName,Hospital hospital)
//	{
//		System.out.println("in show hospital controller");
//				
//		List<Hospital> hospitalList = hospServImpl.getHospital();
//		
//		
//		for(Hospital obj : hospitalList)
//		{
//			if(obj.getCity().equals(cityName))
//			{
//			 return hospitalList;
//			}
//		}
//		System.out.println(hospitalList);
//		return null;
//	}
}
