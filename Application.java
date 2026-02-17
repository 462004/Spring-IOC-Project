package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entity.Student;

public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Student st1 = ac.getBean("student1", Student.class);

		System.out.println(st1);
		
		System.out.println(st1.hashCode());

		
		  Student st2 = ac.getBean("student1", Student.class);
		  
		  System.out.println(st2);
		  
		  System.out.println(st2.hashCode());
		 
	}

}
