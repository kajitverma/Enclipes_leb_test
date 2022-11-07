package com.question3;

public class bank 
{

	 
		
	private double balance;
		 
		 
		Bank(double amount)
		{
			this.balance = amount;
		}
		
		public double getBalance()
		{
			return balance;
		}

			public void setBalance(double balance)
			{
			this.balance = this.balance + balance;
		}

	}
	


