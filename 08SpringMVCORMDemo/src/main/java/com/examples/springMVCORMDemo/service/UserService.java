package com.examples.springMVCORMDemo.service;

import java.util.List;

import com.examples.springMVCORMDemo.entity.User;
import com.examples.springMVCORMDemo.exception.UserAlreadyExistException;

public interface UserService {
	int save(User user) throws UserAlreadyExistException;
	List<User> geUsers();
}
