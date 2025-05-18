package com;
import java.util.Scanner;

class BankMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Depositing amount");
		int x = sc.nextInt();
		System.out.println("enter the Withdrawing amount");
		int y = sc.nextInt();
		
		sc.close();
				
		Bank b = new BankImp();
		b.deposit(x);
		b.withdraw(y);
		b.checkBalance();
	}
}
