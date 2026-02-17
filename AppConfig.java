package com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "empList")
	public List<Employee> getEmployee() {
		Employee e1 = new Employee();
		e1.setId(201);
		e1.setName("rahul");
		e1.setSalary(50000.95);

		Employee e2 = new Employee();
		e2.setId(202);
		e2.setName("sonal");
		e2.setSalary(76000.95);
		Employee e3 = new Employee();
		e3.setId(203);
		e3.setName("jayesh");
		e3.setSalary(89000.95);

		List<Employee> eList = Arrays.asList(e1, e2, e3);

		return eList;
	}

	@Bean(name = "companyObj")
	public Company getCompany() {

		Company c = new Company();
		c.setCid(6700);
		c.setCompanyname("Infosys");
		return c;

	}

}
