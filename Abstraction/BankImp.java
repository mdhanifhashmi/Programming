package com;

class BankImp implements Bank{
	
	int balance = 5000;

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Amount $"+amount);
		balance +=amount;
		System.out.println("Amount is deposited successfully");
		
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing Amount $"+amount);
		balance -=amount;
		System.out.println("Amount is withdrawn successfully");
		
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Available Balance: $"+balance);
		
	}

}
