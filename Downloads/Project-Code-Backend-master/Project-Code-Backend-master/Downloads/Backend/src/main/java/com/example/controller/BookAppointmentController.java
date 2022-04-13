package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.AppointmentDao;
import com.example.dao.DoctorDao;
import com.example.dao.HospitalDao;
import com.example.pojo.Appointment;
import com.example.pojo.Doctor;
import com.example.pojo.Hospital;
import com.example.pojo.Patient;
import com.example.service.AppointmentServiceImpl;
import com.example.service.DoctorServiceImpl;
import com.example.service.HospitalServiceImpl;
import com.example.service.PatientServiceImpl;

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
		System.out.println("in show docs controller");
		return hospDao.getAllHospitalByCity(cityName);
	}
	
	@Autowired
	private DoctorDao doctorDao;
	
	@GetMapping("/showdoctorbyspeciality/{speciality}")
	public List<Doctor> getDoctorBySpeciality(@PathVariable String speciality,Doctor doctor)
	{
		System.out.println("in hosp spec controller");
		return doctorDao.getAllDoctorBySpeciality(speciality);
	}
	
	@GetMapping("/showdoctorbyhospid/{id}")
	public List<Doctor> getDoctorByHospId(@PathVariable int id,Doctor doctor)
	{
		System.out.println("in hosp id controller");
		return doctorDao.getAllDoctorByHospId(id);
	}
	
	@GetMapping("/showdoctorbyid/{id}")
	public Optional<Doctor> getDoctorByDidId(@PathVariable int id)
	{
		System.out.println("in hosp id controller");
		return doctorDao.findById(id);
	}
	
	
	@Autowired
	private AppointmentServiceImpl apptService;
	
	@Autowired
	private HospitalServiceImpl hospService;
	
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@Autowired
	private PatientServiceImpl patientService;
	
	
	@Autowired
	private AppointmentDao apptDao;
	
	@PostMapping("/appointment/confirm/{id}")
	public String bookAppointment(@PathVariable int id,@RequestBody Appointment appt)
	{
		System.out.println("confirm appt ");		
		
		List<Doctor> doctorList = doctorService.getDoctorDetails();
		List<Patient> patientList = patientService.getPatientDetails();
		
		for(Doctor doctorobj : doctorList)
		{
			
		if(doctorobj.getDid() == id)
		{
			System.out.println("in if cond ");
		for(Doctor doctorObj : doctorList)
		{
			if(doctorObj.getDid() == id)
			{
			appt.setDid(doctorObj.getDid());
			appt.setDname(doctorObj.getUsername());
			appt.setFees(doctorObj.getFees());
			appt.setHospId(doctorObj.getHid());
			System.out.println("in doctor");

			}
		}
		
		for(Patient patientObj : patientList)
		{
			if(patientObj.getUsername().equals(appt.getPname()))
			{
				appt.setPid(patientObj.getPid());
				appt.setPname(appt.getPname());
				appt.setAppointmentDate(appt.getAppointmentDate());
				appt.setAppointmentType(appt.getAppointmentType());
				System.out.println("in patient");
			}
		}
		apptDao.save(appt);
		return "sended";
	}
	
	}
		return null;
	}
}
	
