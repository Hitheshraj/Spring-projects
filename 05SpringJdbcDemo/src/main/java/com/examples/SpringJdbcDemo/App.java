package com.examples.SpringJdbcDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.SpringJdbcDemo.dao.EmployeeDAO;
import com.examples.SpringJdbcDemo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // create();
        //update();
    	//delete();
    	//read();
    	readAllEmployee();
    }

	private static void readAllEmployee() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("emoployee");
		List<Employee> emp=employeedao.read();
		System.out.println(emp);
	}

	private static void read() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("emoployee");
		Employee emp=new Employee();
		emp=employeedao.read(1);
		System.out.println(emp);
		
	}

	private static void delete() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("emoployee");
		Employee emp=new Employee();
		employeedao.delete(2);
	}

	private static void update() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("emoployee");
		Employee emp=new Employee();
		emp.setId(3);
		emp.setFirstName("Joy");
		emp.setLastName("M");
		employeedao.update(emp);
	}

	private static void create() {
		System.out.println( " JDBC Template demo!" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeedao=(EmployeeDAO)ctx.getBean("emoployee");
		Employee emp=new Employee();
		emp.setId(2);
		emp.setFirstName("Darshan");
		emp.setLastName("raj");
		employeedao.create(emp);
	}
}
