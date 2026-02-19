package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Config;
import com.models.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		Student student = applicationContext.getBean("student",Student.class);
		System.out.println(student);
	}

}
