package StudentIdDemo;

public class Member {
	
		 
			  String name;
			  int age;
			  String number;
			  String address;
			  int salary;

			  public void printSalary(){
			    System.out.println(salary);
			  }

			}

			class Employee extends Member{
			  String specialization;
			}

			class Manager extends Member{
			  String department;
			}

			class Ans{
			  public static void main(String[] args){
			    Employee e = new Employee();
			    e.name = "Ajit_kumar";
			    e.age = 25;
			    e.number = "9867654321";
			    e.address = "Ranchi_jharkhand";
			    e.salary = 25674;
			    e.specialization = "Developer";

			    Manager m = new Manager();
			   
			  }
			}		





