// Java Program to find common elements in two Arrays

package com.question1;
  
 //import util package
import java.util.Scanner;
// creat class
public class CommanElementOfArray {
	
	 public static void main(String[] args)
	   {
		 //decler the instance variable
		 //input value from user
	      int i, j, arr1, arr2, arrCommonSize, k=0, x, check;
	      Scanner s = new Scanner(System.in);
	      // for 1st array element 
	      System.out.print("Enter the Size of First Array: ");
	      arr1 = s.nextInt();
	      int[] arrOne = new int[arr1];
	      System.out.print("Enter " +arr1+ " Elements: ");
	      for(i=0; i<arr1; i++)
	         arrOne[i] = s.nextInt();
	      // for 2nd array element
	      System.out.print("\nEnter the Size of Second Array: ");
	      arr2 = s.nextInt();
	      int[] arrTwo = new int[arr2];
	      System.out.print("Enter " +arr2+ " Elements: ");
	      for(i=0; i<arr2; i++)
	         arrTwo[i] = s.nextInt();
	      
	      if(arr1<arr2)
	         arrCommonSize = arr1;
	      else
	         arrCommonSize = arr2;
	      int[] arrCommon = new int[arrCommonSize];
	      
	      for(i=0; i<arr1; i++)
	      {
	         for(j=0; j<arr2; j++)
	         {
	            if(arrOne[i]==arrTwo[j])
	            {
	               check = 0;
	               for(x=0; x<k; x++)
	               {
	                  if(arrCommon[x]==arrOne[i])
	                  {
	                     check = 1;
	                     break;
	                  }
	               }
	               if(check==0)
	               {
	                  arrCommon[k] = arrOne[i];
	                  k++;
	               }
	            }
	         }
	      }
	      
	      if(k==0)
	         System.out.println("\nNo common element.");
	      else if(k==1)
	      {
	         System.out.println("\nThere is only one common element.");
	         System.out.println("And the element is: " +arrCommon[0]);
	      }
	      else
	      {
	         System.out.println("\nThere are " +k+ " common elements found.");
	         System.out.print("List of Common Elements: ");
	         for(i=0; i<k; i++)
	            System.out.print(arrCommon[i]+ " ");
	      }// end of if else
	   }//end of main

}//end of class
