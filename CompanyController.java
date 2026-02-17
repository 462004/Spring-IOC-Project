package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompanyController {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Company comp = ac.getBean("companyObj", Company.class);

		System.out.println("Company details:");
		System.out.println(comp);
	}

}
