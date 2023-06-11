package com.examples.springcore;

public class Computer {
int cpucorse;
String memorySize;
String storageSize;
public Computer(int cpucorse, String memorySize, String storageSize) {
	this.cpucorse = cpucorse;
	this.memorySize = memorySize;
	this.storageSize = storageSize;
}
@Override
public String toString() {
	return "Computer [cpucorse=" + cpucorse + ", memorySize=" + memorySize + ", storageSize=" + storageSize + "]";
}


}
