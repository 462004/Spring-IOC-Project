package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.entity.Student;

@Configuration
public class ApplicationConfig {
	
	@Bean(name = "addr1")
	@Primary
	public Address getAddress1() {
		Address a = new Address();
		a.setAid(1001);
		a.setCity("pune");
		return a;
	}
	
	@Bean(name = "saddress")
	public Address getAddress2() {
		Address a = new Address();
		a.setAid(1002);
		a.setCity("mumbai");
		return a;
	}

	@Bean(name = "student1")
	@Scope("singleton")
	public Student getStudentBean1() {
		Student st1 = new Student();
		st1.setId(21);
		st1.setName("ram");
		st1.setMarks(91.0f);
		//manualy
		st1.setAddress(getAddress1());
		return st1;
	}
	
	@Bean(name = "student2")
//	@Scope("singleton")
	public Student getStudentBean2() {
		Student st1 = new Student();
		st1.setId(22);
		st1.setName("jay");
		st1.setMarks(92.0f);
		return st1;
	}
}
