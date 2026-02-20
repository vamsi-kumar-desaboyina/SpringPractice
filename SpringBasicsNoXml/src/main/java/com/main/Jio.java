package com.main;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Jio implements Sim {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("jio");
	}

}
