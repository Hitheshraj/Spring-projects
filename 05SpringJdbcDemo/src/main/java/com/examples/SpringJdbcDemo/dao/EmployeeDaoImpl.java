package com.examples.SpringJdbcDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.SpringJdbcDemo.entity.Employee;
import com.examples.SpringJdbcDemo.rowmapper.EmployeeRowMapper;
@Component("emoployee")
public class EmployeeDaoImpl implements EmployeeDAO{
	@Autowired//if not jdbc template will be null
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Employee emoployee) {
		String sql="insert into employee values(?,?,?)";
		int result =jdbcTemplate.update(sql,emoployee.getId(),emoployee.getFirstName(),emoployee.getLastName());
		System.out.println("Number of record inserted "+result);
		return result;
	}
	@Override
	public int update(Employee employee) {
		String sql="update employee set firstName=? ,lastName=? where id=?";
		int result =jdbcTemplate.update(sql,employee.getFirstName(),employee.getLastName(),employee.getId());
		return result;
	}
	@Override
	public int delete(int id) {
		String sql="delete from employee where id=?";
		int result=jdbcTemplate.update(sql,id);
		return result;
	}
	@Override
	public Employee read(int id) {
		String sql="Select * from employee where id=?";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, employeeRowMapper,id);
		return employee;
	}
	@Override
	public List<Employee> read() {
		String sql="Select * from employee";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		List<Employee> employee=jdbcTemplate.query(sql, employeeRowMapper);
		return employee;
	}
	

}
