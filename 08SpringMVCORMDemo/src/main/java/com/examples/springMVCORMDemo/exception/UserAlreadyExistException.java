package com.examples.springMVCORMDemo.exception;

public class UserAlreadyExistException extends Exception {
	public UserAlreadyExistException(String email) {
		super("User already exists" + email);
	}
}
