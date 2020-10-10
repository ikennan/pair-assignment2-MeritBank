package com.meritamerica.assignment2;

import java.text.ParseException;
import java.util.Date;

public class CheckingAccount extends BankAccount{
	
	
	
	CheckingAccount(double openingBalance){
		super.balance = openingBalance;
	}
	
	
	public double getBalance() {
		return super.getBalance();
	}
	
	public double getInterestRate() {
		return super.getInterestRate();
	
	}

	public String toString() {
		
		return "checking acccount balance: $" + balance
				+ "\n" + "checking account interest rate: " + interestRate 
				+ "\n" + "checking account balance in 3 years: $"+ futureValue(3);
				
	}


}