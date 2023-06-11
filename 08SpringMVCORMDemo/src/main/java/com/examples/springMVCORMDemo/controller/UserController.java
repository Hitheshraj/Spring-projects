package com.examples.springMVCORMDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.springMVCORMDemo.entity.User;
import com.examples.springMVCORMDemo.exception.UserAlreadyExistException;
import com.examples.springMVCORMDemo.service.UserService;

@Controller
public class UserController {
	
	private UserService userservice;
	@Autowired
	public void setuserservice(UserService userservice) {
		this.userservice=userservice;
	}
	
	@RequestMapping("/register")
	public String showRegistractionPage() {
		return "userreg";
		
	}
	@RequestMapping("/registeruser")
	public String registerUser(@ModelAttribute("user") User user,ModelMap model) {
		int result;
		try {
			result=userservice.save(user);
			model.addAttribute("message","User created with id result");
			model.addAttribute("users",userservice.geUsers());
		} catch (UserAlreadyExistException e) {
			model.addAttribute("message",e.getMessage());
		} 
		
		return "userreg";
		
	}
	@RequestMapping("/users")
	public String getUsers(ModelMap model) {
		model.addAttribute("users",userservice.geUsers());
		return "displayusers";
	}
}
