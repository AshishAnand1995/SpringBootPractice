package com.learn.boot.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
       Employee employee=new Employee();
       employee.setDeg("SD");
       System.out.println("Testing");
       Example<Employee> example=Example.of(employee);
       List<Employee> employees= employeeRepository.findAll(example);
		//employees.forEach(System.out::println);
       System.out.println(employees);
	}

}
