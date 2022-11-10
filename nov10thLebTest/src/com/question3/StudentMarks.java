package com.question3;

public class StudentMarks 
{
	  
		
   public static void main(String arg[])
   {
	        //enter studen name in array form
			    	String names[] = { "Ajit", "mukesh", "Sonali", "Chandan", "Kundan" };
       //marks array
   	int marks[] = { 90, 85, 80, 75, 70 };
      
   	int rank[] = { 1, 2, 3, 4, 5 };
   	
	for(int i = 0; i < names.length; i++)
	   {
       System.out.println( names[i] + " has secured rank " + rank[i] + " got " + marks[i] + " marks." );
	   }    
   }// end of main
		

}//end of class


