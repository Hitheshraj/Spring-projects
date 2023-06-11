package com.examples.SpringJdbcDemo.dao;

import java.util.List;

import com.examples.SpringJdbcDemo.entity.Employee;
//DAO data access object
public interface EmployeeDAO {
	int create(Employee emoployee);
	int update(Employee employee);
	int delete(int id);
	Employee read(int id);
	List<Employee> read();
}
