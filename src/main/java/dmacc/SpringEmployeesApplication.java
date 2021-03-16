package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Employee;
import dmacc.beans.Team;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.EmployeeRepository;
//import dmacc.repository.EmployeeRepository;

@SpringBootApplication
public class SpringEmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeesApplication.class, args);
	}
	
		@Autowired
		EmployeeRepository repo;
		
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			
			//Using an existing bean
			Employee e = appContext.getBean("employee", Employee.class);
			e.setMonthlySalary(2500);
			repo.save(e);
			
			//Create a bean to use - not managed by Spring
			Employee d = new Employee("Sandra Boyton", "Project Manager", 3500, 37);
			Team t = new Team("Go-Getters", "UPS");
			d.setTeam(t);
			repo.save(d);
			
			List<Employee> allEmployees = repo.findAll();
			for(Employee people: allEmployees) {
				System.out.println(people.toString());
			}
			
			//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
			//((AbstractApplicationContext) appContext).close();
		
		}
	

}

