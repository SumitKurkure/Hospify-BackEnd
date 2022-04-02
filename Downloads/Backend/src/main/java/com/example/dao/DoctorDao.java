package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Doctor;

public interface DoctorDao extends JpaRepository<Doctor,Integer> 
{
	
}
