package question3;

import java.util.Scanner;

public class ReversString {

		public static void main(String args[])
		{
			//declaring string objects
			String str="",revStr="";
			
			Scanner in = new Scanner(System.in);
			
			//input string 
			System.out.print("Enter a string :");
			str= in.nextLine();
			
			//length of the input string 
			int len= str.length();

			for ( int i = len- 1 ; i >= 0 ; i-- )
				revStr= revStr+ str.charAt(i);

			//print reversed string 
			System.out.println("Reverse String is: "+revStr);
		}

}
