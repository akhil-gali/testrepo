package com.account;

public class Account {
	int accId;
	String accType;
	double accBalance;

	public Account(int accId, String accType, double accBalance) {
		this.accId = accId;
		this.accType = accType;
		this.accBalance = accBalance;
	}

	public void deposit(int amount) {
		accBalance = accBalance + amount;
	}

	public void withdraw(int amount) {
		accBalance = accBalance - amount;
	}

	int getBalance() {
		return (int) accBalance;
	}

	public void display() {
		System.out.println("Balance is: " + getBalance());
	}
}
