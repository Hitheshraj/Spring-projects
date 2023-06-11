package com.examples.Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	Employee emp;
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/Autowiring/springconfig.xml");
		Employee dao=(Employee) ctx.getBean("emp");
		System.out.println(dao);
    }
}
