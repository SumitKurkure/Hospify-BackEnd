package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Doctor;

@Repository
public interface DoctorDao extends JpaRepository<Doctor,Integer> 
{
	
}
