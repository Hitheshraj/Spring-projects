package com.examples.Autowiring;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	 int id;
	 String name;
	 @Autowired
	 @Qualifier("address1")
	 private Address homeaddress;
	 @Autowired
	 @Qualifier("address2")
	 private Address office_address;
//	 @Autowired
//	public Employee(Address address) {
//		super();
//		this.address = address;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Address getAddress() {
//		return address;
//	}
//	@Autowired//Connected the data
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", homeaddress=" + homeaddress + ", office_address="
				+ office_address + "]";
	}
	
	
}
