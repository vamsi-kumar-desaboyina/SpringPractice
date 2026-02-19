package com.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("${number}")
	private int number;
	@Value("${name}")
	private String name;
	@Autowired
	private Address address;
	public Student()
	{
		System.out.println("Hello");
	}
	
	public Student(int number, String name, Address address) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", address=" + address + "]";
	}
}
