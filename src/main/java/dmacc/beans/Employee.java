package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String jobTitle;
	private int monthlySalary;
	private int age;
	@Autowired
	private Team team;
	
	public Employee() {
		super();
		this.jobTitle = "Developer";
		// TODO Auto-generated constructor stub
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(String name, String jobTitle, int monthlySalary, int age) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.monthlySalary = monthlySalary;
		this.age = age;
	}

	public Employee(long id, String name, String jobTitle, int monthlySalary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.jobTitle = jobTitle;
		this.monthlySalary = monthlySalary;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", jobTitle=" + jobTitle + ", monthlySalary=" + monthlySalary
				+ ", age=" + age + ", team=" + team + "]";
	}

	
	
}
