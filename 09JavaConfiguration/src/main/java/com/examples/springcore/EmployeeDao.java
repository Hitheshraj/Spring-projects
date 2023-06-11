package com.examples.springcore;

public class EmployeeDao {
	private String dbserver;
	private String dbport;
	private String dbuser;
	private String dbpassword;
	public EmployeeDao(String dbserver, String dbport, String dbuser, String dbpassword) {
		this.dbserver = dbserver;
		this.dbport = dbport;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}
	public Employee getEmployee(int id) {
		//get db connection using the dbfile
		return null;
	}
	@Override
	public String toString() {
		return "EmployeeDao [dbserver=" + dbserver + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpassword="
				+ dbpassword + "]";
	}
}
