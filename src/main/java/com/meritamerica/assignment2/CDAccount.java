package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	private CDOffering myOffering = null; 
	private double endingBalance;
	
	
	
	//CDAccount is a constructor. It creates the object.
	public CDAccount(CDOffering offering, double balance) {
	   this.myOffering = offering;
	   this.endingBalance = balance;
	}

	public  double getBalance() {
		return endingBalance;
	}
	
	public double getInterestRate() {
		return myOffering.getInterestRate();
		
	}
	
	public int getTerm() {
		return myOffering.getTerm();
	}
	
	public java.util.Date getStartDate(){
		return super.openedOn;
	}
	
	public long getAccountNumber() {
		return super.getAccountNumber();
	}
	
	public double futureValue() {
		return super.futureValue(0);
	}
}
