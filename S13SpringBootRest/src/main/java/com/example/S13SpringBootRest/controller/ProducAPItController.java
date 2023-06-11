package com.example.S13SpringBootRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.S13SpringBootRest.entity.Product;
import com.example.S13SpringBootRest.repository.ProductRepository;

@RestController // As it is a restfull aplication
@RequestMapping("/api/products")
public class ProducAPItController {
	@Autowired
	private ProductRepository repository;

	@GetMapping
	public Iterable<Product> getProducts() {
		return repository.findAll();
	}
	@GetMapping("/{id}")
	public Product getProducts(@PathVariable("id") Integer id) {
		return repository.findById(id).get();
	}
	@PostMapping
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}
	@PutMapping
	public Product update(@RequestBody Product product) {
		return repository.save(product);
	}
}
