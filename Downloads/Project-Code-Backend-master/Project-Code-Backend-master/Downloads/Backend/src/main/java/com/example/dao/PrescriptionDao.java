package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.pojo.Prescription;

@Repository
public interface PrescriptionDao extends JpaRepository<Prescription, Integer> {
	
	@Query(value = "select * from prescription p where p.patientUsername=:username",nativeQuery = true)
	public List<Prescription> getPrescriptionDetailsByUsername(@Param("username") String username);

}
