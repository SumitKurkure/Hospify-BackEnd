package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.pojo.Appointment;

@Repository
public interface AppointmentDao  extends JpaRepository<Appointment, String> {
	
	@Query(value = "select * from appointment a where a.pname=:username",nativeQuery = true)
	public List<Appointment> getAppointmentDetailsByUsername(@Param("username") String username);
	
	@Query(value = "select * from appointment a where a.dname=:username",nativeQuery = true)
	public List<Appointment> getAppointmentByDetailsUsernameDoctor(@Param("username") String username);

}
