package com.examples.springMVCORMDemo.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examples.springMVCORMDemo.entity.User;
public interface UserDao {
	int create(User user);
	List<User> findUsers();
	User findUser(String email);
}
