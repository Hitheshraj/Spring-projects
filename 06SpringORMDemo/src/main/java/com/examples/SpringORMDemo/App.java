package com.examples.SpringORMDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.examples.SpringORMDemo.dao.ProductDao;
import com.examples.SpringORMDemo.entity.Product;
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringORMDemo/springconfig.xml");
		ProductDao productDao =(ProductDao) ctx.getBean("ProductDao");
		Product product=new Product();
		product.setId(1);
		product.setName("Computer");
		product.setDescription("desktop computer");
		product.setPrice(5000.16);
		int result=productDao.create(product);
		System.out.println("Product created "+result);
	}
}
