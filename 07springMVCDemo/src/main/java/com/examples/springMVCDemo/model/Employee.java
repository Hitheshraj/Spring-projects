package com.examples.springMVCDemo.model;

public class Employee {
private int id;
private String name;
private double slaary;
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
public double getSlaary() {
	return slaary;
}
public void setSlaary(double slaary) {
	this.slaary = slaary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", slaary=" + slaary + "]";
}

}
