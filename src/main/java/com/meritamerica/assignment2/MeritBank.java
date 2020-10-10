package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
	private static AccountHolder[] MeritHolders = new AccountHolder [100];
	private static CDOffering[] MeritCD = new CDOffering[5];
	static int best = 0;
	static int second = 0;
	private static int nextAccountNum = 0;


	
	public static void addAccountHolder(AccountHolder accountHolder) {
		for (int i =0; i < MeritHolders.length; i++) {
			if(MeritHolders[i] == null) {
				MeritHolders[i] = accountHolder;
				break;
			}
			
		}
	}
	
	public static AccountHolder[] getAccountHolders() {
		return MeritHolders;
	}

	public static CDOffering[] getCDOfferings() {
		return MeritCD;
	}
	
	public static CDOffering getBestCDOffering(double depositAmount) {
		
		double temp1 = 0;
		double temp2 = 0;
		double temp3 = 0;
		
		for(int i = 0; i<MeritCD.length; i++) {
			
			if(MeritCD[i] != null) {
				
				temp1= futureValue(depositAmount, MeritCD[i].getInterestRate(), MeritCD[i].getTerm());
				if(i != (MeritCD.length - 1)) {
					i++;
					temp2= futureValue(depositAmount, MeritCD[i].getInterestRate(), MeritCD[i].getTerm());	
				}
				
			
			if(temp1 > temp2)
			{
				if(temp1 > temp3) {
					temp3 = temp1;
					
					best = i;
					
					second = i-1;
				}
				
				
				
			}
			
			else {
				if(temp2 > temp3) {
					temp3 = temp2;
					best = i;
				second = i - 1;
				
				}
				
				
			}	
			}
			
			
		}
			
			return MeritCD[best];
	}
	
	
	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		return MeritCD [second];
		
	}
	
	public static void clearCDOfferings() {
		for (int i =0; i < MeritCD.length; i++) {
			if(MeritCD[i] != null) {
				MeritCD[i] = null;
			}
		}
	}
	
	public static void setCDOfferings(CDOffering[] offerings) {
		for (int i =0; i < MeritCD.length; i++) {
			MeritCD[i] = offerings[i];
		}
	}
	
	public static long getNextAccountNumber() {
		int temp = nextAccountNum;
		nextAccountNum++;
		return MeritHolders[temp].cdAccounts[temp].getAccountNumber();

	}
	 public static double totalBalances() {
		 double total = 0;
		 for(int i = 0; i < MeritHolders.length; i++) {
			 
			 if(MeritHolders[i] != null)
			 total = MeritHolders[i].getCombinedBalance();
		 }
		 return total;
	 }
	 
	 public static double futureValue(double presentValue, double interestRate, int term) {
		 double temp = 0;
		 temp = presentValue * Math.pow(1 + interestRate, term);
		 return temp;


	 }


	


	
	


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
