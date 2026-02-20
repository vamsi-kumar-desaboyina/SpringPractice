package com.main;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Primary
public class Airtel implements Sim{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("airtel");
	}
	
	@PostConstruct
	public void m1()
	{
		System.out.println("vamsi");
	}

}
