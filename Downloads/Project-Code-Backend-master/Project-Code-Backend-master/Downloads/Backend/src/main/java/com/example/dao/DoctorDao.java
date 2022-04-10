package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.pojo.Doctor;
import com.example.pojo.Hospital;

@Repository
public interface DoctorDao extends JpaRepository<Doctor,Integer> 
{
	@Query(value = "SELECT * FROM doctor d where d.speciality = :speciality" ,nativeQuery = true)
	public List<Hospital> getAllDoctorBySpeciality(@Param("speciality") String speciality);
}
