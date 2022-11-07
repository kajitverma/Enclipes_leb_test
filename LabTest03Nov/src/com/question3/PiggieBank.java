package com.question3;
// import util package
import java.util.Scanner;
//create class
public class PiggieBank 
{

	public static void main(String[] args)
	{
		 
	// creating object of bank class
		Bank bk = new Bank();
		
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		// display initial Amount
		System.out.println("Amount in your piggie bank is :"+getBalance());
		do 
		{
			System.out.println("How much you want to add amount = ");
			double amt = sc.nextDouble();
			bk.setBalance(amt);
			// display  total amount After add
			System.out.println("total amount in your pigie bank is :"+bk.getBalance());
			
			System.out.println("Are you want to add more maney ?(y/n):");
			ch = sc.next().charAt(0);
		}
		while (ch == 'y');
		}

}
