package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans5.xml");
		Student studentBean = applicationContext.getBean("student",Student.class);
		System.out.println(studentBean);
	}

}
