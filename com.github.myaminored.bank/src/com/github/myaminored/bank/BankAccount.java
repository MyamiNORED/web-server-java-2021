package com.github.myaminored.bank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	
	private double balance;
	private Lock balanceChangeLock;
	
	
	public BankAccount()
	{
		balance =  0 ;
		balanceChangeLock = new ReentrantLock();
	}
	

	public BankAccount(double initialBalance)
	{
		balance =  initialBalance;
	}
	public void deposit(double amount)
	{
		balanceChangeLock.lock();
		try
		{
			double newBalance = balance + amount;
			balance = newBalance ;
		}
		finally
		{
			balanceChangeLock.unlock();
		}
	}
	
	
	public void withdraw(double amount)
	{
		balanceChangeLock.lock();
		try
		{
			double newBalance = balance - amount;
			balance = newBalance ;
		}
		finally
		{
			balanceChangeLock.unlock();
		}
	}
	public double getBalance()
	{
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
