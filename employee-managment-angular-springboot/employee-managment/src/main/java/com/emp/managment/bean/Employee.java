package com.emp.managment.bean;

public class Employee {
private String name;
private String salary;
private String department;
private int empid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public Employee(String name, String salary, String department, int empid) {
	super();
	this.name = name;
	this.salary = salary;
	this.department = department;
	this.empid = empid;
}

}


