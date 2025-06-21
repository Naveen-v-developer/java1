package com.example.springbootbackend;

import com.example.springbootbackend.Model.Employee;
import com.example.springbootbackend.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstname("Naveen");
//		employee.setLastname("Vadde");
//		employee.setId(5);
//		employee.setEmail("vaddanaveen77@gmail.com");
//		employeeRepository.save(employee);
	}
}
