package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Integer>
{
	
}
