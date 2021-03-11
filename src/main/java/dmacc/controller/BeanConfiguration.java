package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Employee;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Employee employee() {
		Employee bean = new Employee("Eric Carle");
		bean.setName("Erica Manning");
		bean.setMonthlySalary(3500);
		bean.setJobTitle("Boss");
		bean.setAge(19);
		return bean;
	}
	
	@Bean 
	public Address address() {
		Address bean = new Address("123 Main Street", "Grimes", "IA");
		return bean;
	}
}
