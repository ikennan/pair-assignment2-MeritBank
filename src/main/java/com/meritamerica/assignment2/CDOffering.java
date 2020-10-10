package com.meritamerica.assignment2;

public class CDOffering {
	
	private int loanTerm;
	private double iRate;
	
	
	public  CDOffering (int term, double interestRate){
		this.loanTerm = term;
		this.iRate = interestRate;

	}
	
	public int getTerm() {
		return loanTerm;
	}
	
	public double getInterestRate() {
		return iRate;
	}


}
