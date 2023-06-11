package com.examples.stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.stereotypes.bean.Instructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/stereotypes/springconfig.xml");
		Instructor instructor=(Instructor) ctx.getBean("instructor");
		System.out.println(instructor);
    }
}
