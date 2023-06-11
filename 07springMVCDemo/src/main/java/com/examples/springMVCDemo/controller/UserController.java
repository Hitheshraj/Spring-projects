package com.examples.springMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.springMVCDemo.model.User;

@Controller
public class UserController {
	@RequestMapping("/register")
	public ModelAndView showRegistractionPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registeruser");
		return mv;
	}

	@RequestMapping(value = "/signupuser", method = RequestMethod.POST)
	public ModelAndView SignUpUser(@ModelAttribute("user") User user)//That stores data that come by post
	{
		System.out.println("From UI.Retrived Object from Spring Container: " + user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",user);
		mv.setViewName("registeruserResult");
		return mv;
	}
	@RequestMapping(value = "/signupuser2", method = RequestMethod.POST)
	public String SignUpUser2(@ModelAttribute("user") User user,ModelMap model)//That stores data that come by post and bundels into Object
	{//Need not create Model view every time can use get from here
		System.out.println("From UI.Retrived Object from Spring Container: " + user);
		model.addAttribute("user",user);
		return "registeruserResult";
	}
}
