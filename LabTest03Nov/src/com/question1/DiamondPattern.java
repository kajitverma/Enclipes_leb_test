
package com.question1;
//import scanner package
import java.util.Scanner;

//create class
public class DiamondPattern 
{
	public static void main (String args[])
	{
		  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of rows: ");  
		  
		int rows=sc.nextInt();  
		System.out.print("Enter the symbol you want to print: ");   
		  
		char symbol=sc.next().charAt(0);  
		//prints upper section of the pattern  
		for(int i=1; i<=rows; i++)  
		{  
		for(int j=rows; j>i; j--)  
		{  
		//prints space        
		System.out.print(" ");  
		}  
		//prints symbol  
		System.out.print(symbol);  
		for(int j=1; j<(i-1)*2; j++)  
		{  
		//prints space      
		System.out.print(" ");  
		}  
		if(i==1)  
		{  
	
		System.out.print("\n");  
		}  
		else  
		{  
		//prints symbol and throws cursor to the next line          
		System.out.print(symbol+"\n");  
		}  
		}    
		//prints lower section of the pattern  
		for(int i=rows-1; i>=1; i--)  
		{  
		for(int j=rows; j>i; j--)  
		{  
		//prints space          
		System.out.print(" ");  
		}  
		//prints symbol  
		System.out.print(symbol);  
		for(int j=1; j<(i-1)*2; j++)  
		{  
		//prints space      
		System.out.print(" ");  
		}  
		if(i==1)  
		{  
		//print  next line          
		System.out.print("\n");  
		}  
		else  
		{  
		//prints symbol and throws the user input      
		System.out.print(symbol+"\n");  
		}  
		}  
		}  
		 
}
