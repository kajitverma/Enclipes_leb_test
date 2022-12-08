package question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentId 
{
	public int id(int id)
	{
		return id;
		
	}
	public String Name(int iD, String name)
	{
		return name;
		
	}
	
		public static void main(String[] args) {
		 
		Map <Integer, String> id = new HashMap<>();
		id.put(1, "Ajit kumar");
		id.put(2, "Ajay Kumar");
		id.put(3, "Abhijit kumar");
		id.put(4, "Abhishek kumar");
		id.put(5, "Abhinash kumar");
		id.put(6, "Abhinav kumar");
		
		System.out.println("Enter the ID you want to Search : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		sc.close();
	}

}

