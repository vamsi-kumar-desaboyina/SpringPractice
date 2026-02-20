package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Config;

public class MainSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		SimTest simTest = applicationContext.getBean("simTest",SimTest.class);
		simTest.callSim();
	}

}
