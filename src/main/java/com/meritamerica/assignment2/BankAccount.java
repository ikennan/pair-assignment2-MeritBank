package com.meritamerica.assignment2;

import java.util.Date;

//Bank account is the parent to checking and savings account.
public class BankAccount {
	
	public long accountNumber;
	public double balance;
	public double interestRate;
	double futureValue;
    Date openedOn;
    
    public BankAccount() {
    	
    }
	
	public BankAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public BankAccount(long accountNumber, double balance, double interestRate)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		//this.openedOn = openedOn;
		
	}
	
	/*public BankAccount(double balance, double interestRate, Date openedOn) {
		this(MeritBank.getNextAccountNumber(), balance, interestRate, openedOn);
	}
	*/
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public boolean withdraw(double amount) {
		boolean success = false; 
		if (this.balance > amount) {
			balance = balance - amount;
			success = true;
		}
		return success;
		
	}
	
	public boolean deposit(double amount) {
		if(amount<0.0) {
			//System.out.println("Cannot deposit a negative amount.");
			return false;
			
		} else {
			balance = balance + amount;
			return true;
		}
		
		
	}
	
	public double futureValue(int years) {
		futureValue = balance * (Math.pow((1 + interestRate),years));
		return futureValue;
	}

}
