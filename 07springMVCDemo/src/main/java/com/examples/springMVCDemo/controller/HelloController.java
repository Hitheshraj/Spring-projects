package com.examples.springMVCDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.springMVCDemo.model.Employee;

@Controller
public class HelloController {
	@RequestMapping("/hello")
public ModelAndView hello() {
	ModelAndView modelView=new ModelAndView();
	modelView.addObject("id",123);
	modelView.addObject("name","ken");
	modelView.addObject("salary",1000);
	modelView.setViewName("hello");
	return modelView;
}
	@RequestMapping("/readobject")
public ModelAndView read() {
	ModelAndView modelView=new ModelAndView();
	Employee emp=new Employee();
	emp.setId(12);
	emp.setName("Raj");
	emp.setSlaary(3456.5);
	modelView.addObject("employee",emp);
	modelView.setViewName("hello");
	return modelView;
}
	@RequestMapping("/employee")
	public ModelAndView read2() {
		ModelAndView modelView=new ModelAndView();
		List<Employee> employee=new ArrayList<>();
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Raj");
		emp.setSlaary(3456.5);
		employee.add(emp);
		Employee emp1=new Employee();
		emp.setId(2);
		emp.setName("Roy");
		emp.setSlaary(4456.5);
		employee.add(emp);
		Employee emp2=new Employee();
		emp.setId(3);
		emp.setName("Alen");
		emp.setSlaary(2456.5);
		employee.add(emp);
		modelView.addObject("employee",employee);
		modelView.setViewName("employee");
		return modelView;
	}
	@RequestMapping("/showdata")
	public ModelAndView showData(@RequestParam("id") int id,@RequestParam("name") String name) {
		System.out.println("ID"+id);
		System.out.println("Name"+name);
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("id",id);
		modelView.addObject("name",name);
		modelView.setViewName("showdata");
		return modelView;
	}
}
