package com.technoelevate.multithreading.synchronizeddemo;

public class Account {
	int balance;
	
	public Account(int balance) {
		super();
		this.balance=balance;
		
	}
	public void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("insufficient balance");
			return;
		}
		balance -=amount;
		System.out.println("Withdraw successful");
		System.out.println("Balance= " + balance);
		
	}
	public synchronized void deposite(int amount) {
		int temp=balance;
		temp+=amount;
		balance=temp;
		System.out.println("deposited successful");
		System.out.println("Account balance = "+ balance);
	}
	public void checkBlanace() {
		System.out.println("Balance = "+ balance);
	}
}
