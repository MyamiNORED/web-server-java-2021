package com.github.myaminored.bank;

public class Bank {

	/**
	 * A bank consisting of multiple bank accounts;
	 * 
	 */

	private BankAccount[] accounts;
	
	/**
		Construct a bank with a given number of bank accounts.
		@param size the number of accounts.
	*/
	
	public Bank(int size) {
		accounts = new BankAccount[size];
		for(int i = 0 ; i < accounts.length; i++) {
			accounts[i] = new BankAccount();
		}
	}
	
	/*
	 * Deposit money into a bank account
	 * @param accountNumbe The account number
	 *@param amount  the amount to deposit
	 */
	public void deposit(int accountNumber, double amount)
	{
		BankAccount account = accounts[accountNumber];
		account.deposit(amount);
	}
	public void withdraw (int accountNumber, double amount) {
		BankAccount account = accounts[accountNumber];
		account.withdraw(amount);
	}
	
	
	
	public double getBalance(int accountNumber) {
		BankAccount account = accounts[accountNumber];
		return account.getBalance();
	}
	
	
	
}


