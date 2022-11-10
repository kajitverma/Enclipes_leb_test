package com.question2;

//import util package
import java.util.*;

public class StudentRecord {
	
	
	    private String s_name;
	    private int s_age;
	    private String s_course;
	    private String s_year;
	    private String s_section;
	  //  private String Student;

	    public Student(String name, int age, String course, String year, String section )
	    {
	        s_name = name;
	        s_age = age;
	        s_course = course;
	        s_year = year;
	        s_section = section;
	    }

	    public String getName()
	    {
	        return s_name;
	    }

	    public int getAge()
	    {
	        return s_age;
	    }

	    public String getCourse()
	    {
	        return s_course;
	    }

	    public String getYear()
	    {
	        return s_year;
	    }

	    public String getSection()
	    {
	        return s_section;
	    }

	    public String toString()
	    {
	        return "name: " + s_name + ", age: " + s_age + ", course: " + s_course + ", year: " + s_year +", section: " + s_section;
	    }

	    public static void main(String[] args) 
	    {
	       ArrayList<Student> student = new ArrayList<Student>();
	       Scanner input = new Scanner(System.in);

	       int menuChoice = 4;
	       do {
	           System.out.println("\t\t\tStudent Record Menu");
	           System.out.println("\t\t1. Add Student\t2. View Students\t3. Search Student\t4. Exit");
	           try {
	               System.out.println("Enter a choice: ");
	               menuChoice = Integer.parseInt(input.nextLine());
	           } catch (NumberFormatException e) {
	               continue;
	           }

	           if (menuChoice==1)
	           {
	               System.out.println("Full name:");
	               String name = input.nextLine();

	               int age = -1;
	               do {
	                   try 
	                   {
	                       System.out.println("Age:");
	                       age = Integer.parseInt(input.nextLine());
	                   } catch (NumberFormatException e) 
	                   {
	                       System.out.println("Enter a number!");
	                       continue;
	                   }
	               } while (age <= 0);

	               System.out.println("Course:");
	               String course = input.nextLine();

	               System.out.println("Year:");
	               String year = input.nextLine();

	               System.out.println("Section:");
	               String section = input.nextLine();

	               Student student = new Student(name, age, course, year, section);
	               student.add(student);

	           } 
	           else if (menuChoice==2) 
	           {
	               System.out.println("Students:");
	               for (Student student : students)
	               {
	                   System.out.println(student);
	               }
	           }
	       } while (menuChoice<4);
	    }
	}

