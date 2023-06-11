package com.example.S10SpringBootDemo;

import javax.naming.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.S10SpringBootDemo.service.SomeService;

@SpringBootApplication
public class S10SpringBootDemoApplication {
	@Autowired
	ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(S10SpringBootDemoApplication.class, args);
		
	}

}
