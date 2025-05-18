package com;

import java.util.Scanner;
class CalculatorMainClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int x = sc.nextInt();
		System.out.println("Enter the second Number:");
		int y =  sc.nextInt();
		
		Calculator c = new CalculatorImp(); //rule 4
		c.add(x, y);
		c.mul(x, y);
		
		sc.close();
	}
}
