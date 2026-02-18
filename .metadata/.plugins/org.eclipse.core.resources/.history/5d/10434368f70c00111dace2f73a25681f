package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		System.out.println("container created");
//		Student bean =(Student) applicationContext.getBean("student"); or we can use
		Student studentBean = applicationContext.getBean("student",Student.class);
		System.out.println(studentBean);
		Student studentBean1 = applicationContext.getBean("student",Student.class);
		System.out.println(studentBean1);
		Student studentBean2 = applicationContext.getBean("student1",Student.class);
		System.out.println(studentBean2);
		System.out.println(studentBean==studentBean1);
		System.out.println(studentBean2==studentBean);
		Student studentBean3 = applicationContext.getBean("student2",Student.class);
		System.out.println(studentBean3);
		
	}

}
