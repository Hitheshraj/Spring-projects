package com.examples.springMVCORMDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.examples.springMVCORMDemo.dao.UserDao;
import com.examples.springMVCORMDemo.entity.User;
import com.examples.springMVCORMDemo.exception.UserAlreadyExistException;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userdao;
	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistException {
		//Where we do the business logic
		//if email exist we throw exception
		if(userdao.findUser(user.getEmail())!=null) {
			throw new UserAlreadyExistException(user.getEmail());
		}
		return userdao.create(user);
	}
	@Override
	public List<User> geUsers() {
		
		return userdao.findUsers();
	}

}
