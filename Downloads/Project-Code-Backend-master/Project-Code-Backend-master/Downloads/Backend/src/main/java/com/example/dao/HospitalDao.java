package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.pojo.Hospital;

@Repository
public interface HospitalDao extends JpaRepository<Hospital, Integer> {
	@Query(value = "SELECT * FROM hospital h where h.city= :city" ,nativeQuery = true)
	public List<Hospital> getAllHospitalByCity(@Param("city") String city);
}
