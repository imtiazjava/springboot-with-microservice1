package com.cgi.bd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cgi.bd.entity.Employee;
import com.cgi.bd.repository.EmployeeRepository;

@SpringBootApplication
public class MysqlapplicationApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(MysqlapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("RAJU");
		emp.setSalary(30000);
		System.out.println(this.employeeRepository.save(emp));
		
	}
	
	

}
