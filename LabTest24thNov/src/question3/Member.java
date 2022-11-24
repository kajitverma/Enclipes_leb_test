package question3;

public class Member 
{
	 
	    private String name;
	    private int age;
	    private String phoneNumber;
	    private String address;
	    private double salary;

	    public Member(String name, int age, String phoneNumber, String address, double salary) 
	    {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	    }

	    public void printSalary() {
	        System.out.println("Salary " + salary);
	    }
	}

	public class Employee extends Member
	{
	    private String specialization;

	    public Employee(String name, int age, String phoneNumber,
	                    String address, double salary, String specialization)
	    {
	        super(name, age, phoneNumber, address, salary);
	        this.specialization = specialization;
	    }
	}

	public class Manager extends Member
	{
	    private String department;

	    public Manager(String name, int age, String phoneNumber,
	                    String address, double salary, String department) 
	    {
	        super(name, age, phoneNumber, address, salary);
	        this.department = department;
	    }
	
	    public static void main(String[] args) 
	    {
	        Employee employee = new Employee("Ajit", 24, "997865432", "kokar", 35678.5, "IT");
	        Manager manager = new Manager("Sanjay", 30, "997788865", "Ranchi", 45678.0, "IT");
	        employee.printSalary();
	        manager.printSalary();
	    }
	}


