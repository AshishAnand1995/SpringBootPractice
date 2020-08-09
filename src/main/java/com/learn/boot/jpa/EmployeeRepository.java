package com.learn.boot.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e")
	List<Employee> getAllDetails();
	
}
