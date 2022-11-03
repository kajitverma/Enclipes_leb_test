/*
 * Program : WAP to print the table
 * @author : Ajit kumar
 * @Date   :28 oct 2022
 */

package loopsDemo;
// create class
public class forloop
{
	//calling method
	public static void getTable(int n)
	{
	int i ;// declaring variables
	for(i=1;i<=10;i++)
		System.out.println(n+"  X  "+i+" = "+(n*i));
	}
	// main method started
	public static void main(String []args)
	{
		//calling method
	
	getTable(Integer.parseInt(args[0]));
	}
}
