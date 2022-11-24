package question2;

public class ParantClass 
{
	
		  public void parantmethod()
		  {
		    System.out.println("This is parent class");
		  }
		}

		class Chaildclass extends ParantClass
		{
		  public void chaildmethod()
		  {
		    System.out.println("This is child class");
		  }
		}

		class call
		{
		  public static void main(String[] args)
		  {
			  ParantClass m = new ParantClass();
		    Chaildclass n = new Chaildclass();
		    m.parantmethod();
		    n.chaildmethod();
		    n.parantmethod();
		  }
		

	 
}
