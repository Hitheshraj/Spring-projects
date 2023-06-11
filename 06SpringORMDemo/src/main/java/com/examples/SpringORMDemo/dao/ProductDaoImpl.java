package com.examples.SpringORMDemo.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.examples.SpringORMDemo.entity.Product;
@Component("ProductDao")
public class ProductDaoImpl implements ProductDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	@Override
	@Transactional
	public int create(Product product) {
		Integer result=(Integer) hibernateTemplate.save(product);
		return result;
	}
}
