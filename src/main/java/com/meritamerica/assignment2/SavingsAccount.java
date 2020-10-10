package com.meritamerica.assignment2;
import java.text.ParseException;
import java.util.Date;
//inherits the attributes of Bank account. no need to repeat 
//the variables that were instantiated in bankaccount.

//super means parent class.
public class SavingsAccount extends BankAccount{

	
	SavingsAccount(double openingBalance){
		super.balance = openingBalance;
	}
	

	public double getBalance() {
		return super.getBalance();
	}
	
	public double getInterestRate() {
		return super.getInterestRate();
	}
	
	public String toString() {
		return "savings account balance: $" + balance
		+ "\n" + "savings account interst rate: " + interestRate 
		+ "\n" + "savings account balance in 3 years: $" + futureValue(3);
	}
}