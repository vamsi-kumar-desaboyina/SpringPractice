package com.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${street}")
	private String street;
	@Value("${pincode}")
	private int pincode;
	public Address() {
		
	}
	public Address(String street, int pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}
}
