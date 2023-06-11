package com.examples.springcore;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //demo1();
    	//demo2();
    	//demo3();
    	demo4();
    }
    private static void demo4() {//load from external file
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/springcore/springconfig4.xml");
		EmployeeDao dao=(EmployeeDao) ctx.getBean("dao");
		System.out.println(dao);
	}
	private static void demo3() {//Constructor assignment in config file
   	 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/springcore/springconfig3.xml");
   	 Computer c1=(Computer) ctx.getBean("homecomputer");
   	 System.out.println(c1);
    }
private static void demo2() {
	 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/springcore/springconfig2.xml");
	 Car c1=(Car)ctx.getBean("car");
	 System.out.println(c1.hashCode());
	 Car c2=(Car)ctx.getBean("car");
	 System.out.println(c2.hashCode());//Same bean is given all the time
	 Object b1=ctx.getBean("bank");
	 Object b2=ctx.getBean("bank");
	 System.out.println(b1.hashCode());//Different hash code ass the scope is set to prototype
	 System.out.println(b2.hashCode());

}
	private static void demo1() {
		System.out.println( "Hello World!" );
        //Traditional way
//        Employee emp=new Employee();
//        emp.setId(1);
//        emp.setName("HGR");
//        System.out.println(emp);
        //Using Spring contain
        //Create the Spring container
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/springcore/springconfig.xml");
        //Ask the container for employee bean
        Employee emp1=(Employee) ctx.getBean("emp1");//we get Object so cast to Employee
        System.out.println(emp1);
        Employee emp2=(Employee) ctx.getBean("emp2");//we get Object so cast to Employee
        System.out.println(emp2);
        Employee emp3=(Employee) ctx.getBean("emp3");//we get Object so cast to Employee
        System.out.println(emp3);
        Employee emp4=(Employee) ctx.getBean("emp4");//we get Object so cast to Employee
        System.out.println(emp4);
        Employee emp5=(Employee) ctx.getBean("emp5");//we get Object so cast to Employee
        System.out.println(emp5);
        Employee emp6=(Employee) ctx.getBean("emp6");//we get Object so cast to Employee
        System.out.println(emp6);
        Employee emp7=(Employee) ctx.getBean("emp7");//we get Object so cast to Employee
        System.out.println(emp7);
	}
}
