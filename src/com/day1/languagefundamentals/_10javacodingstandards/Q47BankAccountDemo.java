package com.day1.languagefundamentals._10javacodingstandards;

//47. Write a program with meaningful variable names and explain them in comments.
public class Q47BankAccountDemo {

	// Instance variables with meaningful names
	private String accountHolderName; // Name of the account holder
	private String accountNumber; // Unique account number
	private double accountBalance; // Current balance in the account

	// Constructor to initialize the account details
	public Q47BankAccountDemo(String name, String number, double balance) {
		accountHolderName = name;
		accountNumber = number;
		accountBalance = balance;
	}

	// Method to deposit money into account
	public void deposit(double amount) {
		accountBalance += amount; // Add amount to current balance
		System.out.println(amount + " deposited. New balance: " + accountBalance);
	}

	// Method to withdraw money from account
	public void withdraw(double amount) {
		if (amount <= accountBalance) {
			accountBalance -= amount; // Subtract amount from balance
			System.out.println(amount + " withdrawn. Remaining balance: " + accountBalance);
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	// Display account details
	public void displayAccountDetails() {
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Balance: " + accountBalance);
	}

	public static void main(String[] args) {
		// Create a bank account object
		Q47BankAccountDemo myAccount = new Q47BankAccountDemo("Alice Johnson", "AC12345", 5000);

		myAccount.displayAccountDetails(); // Show initial details
		myAccount.deposit(1500); // Deposit money
		myAccount.withdraw(2000); // Withdraw money
	}
}
