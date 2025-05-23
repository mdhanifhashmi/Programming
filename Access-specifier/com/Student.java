package com;

//Accessing a public members inside a same class.
public class Student {

	public static int age = 22;
	public static String name = "Tom";

	public void study() {
		System.out.println("Studying java");
	}
	
	public static void main(String[] args) {
		System.out.println("aga: "+ Student.age);
		System.out.println("Name: "+ Student.name);
		
		Student s = new Student();
		s.study();
	}

}
