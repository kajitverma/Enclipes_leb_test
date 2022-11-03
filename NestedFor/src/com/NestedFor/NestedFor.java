/*
 * Program : WAP to print the table
 * @author : Ajit kumar
 * @Date   :28 oct 2022
 */

package com.NestedFor;

public class NestedFor 
{
{
		//outer for loop
		for(int i=1;i<3;i++)
		{
			System.out.println( );
			// inner for loop
			for(int j=1; j<3;j++)
			{
				System.out.println(j+ " ");
				if(i ==j)
					break;
			}//end of inner loop
		}//end of outer loop
	}
}