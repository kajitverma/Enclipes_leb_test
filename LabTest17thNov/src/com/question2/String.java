package com.question2;
import java.util.*;

import java.util.Scanner;

public class String 
{
		 
	public static void main(String[] args)
	{
	  // create scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1 = sc.next();
		System.out.println("Enter 2nd String");
		String s2 = sc.next();

		//length of string function

		System.out.println("string length is: "+s1.length());

		System.out.println("string length is: "+s2.length());

		//compareing string

		System.out.println(s1.compareTo(s2));

		//concate two string in one function
		s1=s1.concat("how are you");

		System.out.println(s1);

		//Empty Function

		System.out.println(s2.isEmpty());
		System.out.println("Length of String = "+length);
		System.out.println("Char at index 1= "+s1);
		System.out.println("String after Concatenation: "+con);
		System.out.println("Value after comparing both strings = " +a);

		}
	sc.close();
}

	 
