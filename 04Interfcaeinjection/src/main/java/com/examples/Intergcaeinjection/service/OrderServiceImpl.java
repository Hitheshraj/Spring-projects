package com.examples.Intergcaeinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.examples.Intergcaeinjection.dao.OrderDAO;
@Component("orderservice")
public class OrderServiceImpl implements OrderService {
	@Autowired
	@Qualifier("Oracle")
	private OrderDAO ordredao;
	@Override
	public void placeOrder() {
		System.out.println("Perform business logic");
		System.out.println("Ready to create order");
		ordredao.createOrder();
	}
}
