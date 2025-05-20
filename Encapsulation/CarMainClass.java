package javabean;

import java.util.Scanner;

class CarMainClass {
	public static void main(String[] args) {
		
		//Car obj creation
		Car c = new Car();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int n = sc.nextInt();
		
		
		
		//setter and getter method
		c.setCost(n);
		int price = c.getCost();
		
		System.out.println("Cost the the car "+price);
		sc.close();
	}

}
