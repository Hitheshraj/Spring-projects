package com.examples.Intergcaeinjection.dao;

import org.springframework.stereotype.Component;

@Component("Oracle")
public class OrderDaoOracleImpl implements OrderDAO {
@Override
public void createOrder() {
	System.out.println("Open Connection to Oracle DB");
	System.out.println("Run insert statement on Oracle DB");
	System.out.println("Order Created in Oracle DB");
}
}
