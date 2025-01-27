package com.account.test;

import java.util.Scanner;

import com.account.Account;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account account = new Account(123, "Savings", 12000.00);
		int i = 0;
		while(i!=4) {	
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Display Balance");
		System.out.println("4. Exit");
		 i= sc.nextInt();
		  switch (i) {
		case 1: {
			System.out.println("enter the amount you want to deposit: ");
			int deposit_ammount= sc.nextInt();
			account.deposit(deposit_ammount);
			break;
		}
		case 2: {
			System.out.println("enter the amount you want to withdraw: ");
			int withdraw_ammount= sc.nextInt();
			account.withdraw(withdraw_ammount);
			break;
		}
		case 3: {
			account.display();
			break;
		}
		case 4: break; 
		default: System.out.println("invalid input");
		
	}

	}
		System.out.println("exiting...");
	}
}

