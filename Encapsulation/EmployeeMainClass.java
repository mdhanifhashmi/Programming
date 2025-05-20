package javabean;


public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setId(101);
		emp.setName("Han");
		
		System.out.println("Id; "+emp.getId());
		System.out.println("Name: "+emp.getName());
}}
