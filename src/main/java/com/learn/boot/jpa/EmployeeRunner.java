package com.learn.boot.jpa;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
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
		/** Find all method with Example class*/
     /*  Employee employee=new Employee();
       employee.setDeg("SD");
       System.out.println("Testing");
       Example<Employee> example=Example.of(employee);
       List<Employee> employees= employeeRepository.findAll(example);
		//employees.forEach(System.out::println);
       System.out.println(employees);*/
		
		/**Save Data with Date,Time And TimeStamp*/
		/*Employee employee=new Employee();
		employee.setEname("CC");
		employee.setDeg("Developer");
		employee.setDateTimeOfJoin(new Date());
		employee.setDoj(new Date());
		employee.setSalary(60000.00);
		employee.setToj(new Date());
		employeeRepository.save(employee);*/
		
		
		/** save date with Image and Large text*/
	
		/*FileInputStream fis=new 
				FileInputStream("D:\\Spring Boot+Microservices(Naresh IT)\\image.png");
		
		byte[] img= new byte[fis.available()];
		fis.read(img);
		String text="hbcjbcjnkxbcsgcjabs jc bgcbc chcibh ihcibfhxjvgvcsichuisgcsbuicoiscpo "
				+ "chubdccvtfcutv7tfyuguigdutgctvx v8fvuadusihojos7fv vin0hi0 b bkn"
				+ "vjbdcicvyiufchfkv y8cgbjgfugudhklugcV yi0g-0 vyfACPO-[X Jhu gh o-o hc"
				+ "nc 9v0n9hijon0kibcnjbcci yhvgk hjojiohcjnchu gugcu"
				+ "jc ucgu hiig9un8yuhsaihixguvsijojf"
				+ "jhci viv i jvithio9usoishIvhiuhgihp";
		char[] text1=text.toCharArray();
		
		Employee employee=new Employee();
		employee.setEname("CC");
		employee.setDeg("Developer");
		employee.setDateTimeOfJoin(new Date());
		employee.setDoj(new Date());
		employee.setSalary(60000.00);
		employee.setToj(new Date());
		employee.setImg(img);
		employee.setLargetext(text1);
		employeeRepository.save(employee);*/
		
		/** Save Data with Collection*/
         
		Employee employee=new Employee();
		List<String> dept=new ArrayList<>();
		dept.add("QA");
		dept.add("DEV");
		dept.add("UAT");
		employee.setEname("CC");
		employee.setDeg("Developer");
		employee.setDateTimeOfJoin(new Date());
		employee.setDoj(new Date());
		employee.setSalary(60000.00);
		employee.setToj(new Date());
		employee.setDept(dept);
		employeeRepository.save(employee);
		
		
	}

}
