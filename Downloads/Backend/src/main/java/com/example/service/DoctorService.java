package com.example.service;

import java.util.List;

import com.example.pojo.Doctor;


public interface DoctorService {
	public List<Doctor> findByUsernameAndPassword(Doctor doctor);
	public Doctor registerDoctor(Doctor doctor);
	
}