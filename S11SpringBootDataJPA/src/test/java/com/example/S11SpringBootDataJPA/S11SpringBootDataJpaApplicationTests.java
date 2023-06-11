package com.example.S11SpringBootDataJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootDataJPA.entiy.Product;
import com.example.S11SpringBootDataJPA.repository.ProductRepository;

@SpringBootTest
class S11SpringBootDataJpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}

//	@Test

	void createProduct() {
		Product product = new Product();
		product.setName("Headset");
		product.setDesc("Bluetooth capable headset");
		product.setPrice(2000);
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		productRepository.save(product);
	}

	// @Test
	void readProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productRepository.findById(4);// To Check the Null value
		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
		} else {
			System.out.println("Not Present");
		}
	}

	// @Test
	void updateProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productRepository.findById(3);// To Check the Null value
		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
			product.setPrice(1000);
			productRepository.save(product);

		} else {
			System.out.println("Not Present");
		}
	}

	//@Test
	void readallProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findAll();
		System.out.println(products);
	}
	@Test
	void readallProductByName() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findByName("Headset");
		System.out.println(products);
	}

}
