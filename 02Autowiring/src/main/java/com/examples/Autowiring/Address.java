package com.examples.Autowiring;

public class Address {

	private String City;
	private String State;
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
