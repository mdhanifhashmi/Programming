package com;

//Accessing public members in different class but in same package
public class EmployeeMainClass {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println("Id: "+emp.id);
		System.out.println("Name: "+emp.name);
		
		Employee.work();
	}
}
