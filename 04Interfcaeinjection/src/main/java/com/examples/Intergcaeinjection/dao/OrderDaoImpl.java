package com.examples.Intergcaeinjection.dao;

import org.springframework.stereotype.Component;

@Component("ordredao")
public class OrderDaoImpl implements OrderDAO {
@Override
public void createOrder() {
	System.out.println("Open Connection to MySQL DB");
	System.out.println("Run insert statement on MySQL DB");
	System.out.println("Order Created in MySQL DB");
}
}
