package com.example.guides;

import com.example.guides.model.Employee;
import com.example.guides.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuidesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GuidesApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
	Employee employee=new Employee();
	employee.setFirstname("Sancheet");
	employee.setLastname("Walekar");
	employee.setEmailId("sancheet.walekar@ripplehire.com");
	employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setFirstname("Krishna");
		employee1.setLastname("Pande");
		employee1.setEmailId("krishna.pande@ripplehire.com");
		employeeRepository.save(employee1);

	}
}
