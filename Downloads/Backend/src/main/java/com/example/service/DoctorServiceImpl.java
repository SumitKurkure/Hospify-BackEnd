package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DoctorDao;
import com.example.pojo.Doctor;




@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorDao doctorDao;

	@Override
	public List<Doctor> findByUsernameAndPassword(Doctor doctor)
	{
		return doctorDao.findAll();
		
	}

	@Override
	public Doctor registerDoctor(Doctor doctor) {
		return doctorDao.save(doctor);
	} 
	
}