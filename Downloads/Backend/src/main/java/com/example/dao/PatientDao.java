package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Patient;

public interface PatientDao extends JpaRepository<Patient, Integer>{
	public void loginDetails();
}
