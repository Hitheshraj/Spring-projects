package com.examples.stereotypes.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Bangalore")
	private String City;
	@Value("KA")
	private String State;
	@Value("670070")
	private String Pincode;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Pincode=" + Pincode + "]";
	}
	

}
