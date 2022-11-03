package com.bankAccountDemo;
// import pacakage
import java.util.Scanner;
// creat class
public class AccountDetails 
{

	 //declear instance variables 
	private int accountID;
	private String accountName;
	private double balance;
	private String panNumber;
	
	//method to enter bank details
	void enterBankDetails(int id,String name, double bal, String pan)
	{
		accountID = id;
		accountName = name;
		balance = bal;
		panNumber = pan;
		
	}
	// mmethod to deposit
	double depositMoney(double amount)
	{
		balance += amount;
		System.out.println("Amount Deposited...");
		return balance;
	}
	// method to withdraw
	double withdraw(double amount)
	{
		double tempBalance = balance;
		tempBalance = tempBalance - amount;
		// condition to cheak wether we have sufficient balance
		if(tempBalance > 500)// minimun balance is 500
		{
			balance = tempBalance;
			System.out.println("Withdrawal Successfull..");
			
		}
		else
			System.out.println("Your balance is low ..");
		return balance;
		
		}
	//print Details
	void printBankDetails()
	{
		System.out.println("Account ID: "+accountID);
		System.out.println("Account  Name : "+ accountName);
		System.out.println("Balance : "+balance);
	}
		// to get pan Number
	String getPanNumber()
	{
		return panNamber;
	}
}
