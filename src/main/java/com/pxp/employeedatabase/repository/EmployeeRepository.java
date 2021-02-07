package com.pxp.employeedatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pxp.employeedatabase.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	Boolean existsByFirstNameAndLastName(String firstName, String lastName);
	Boolean existsById(int id);
	
}
