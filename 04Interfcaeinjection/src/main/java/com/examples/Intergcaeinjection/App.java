package com.examples.Intergcaeinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.Intergcaeinjection.service.OrderService;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/Intergcaeinjection/springconfig.xml");
		OrderService orderService=(OrderService)ctx.getBean("orderservice");
		orderService.placeOrder();
    }
}
