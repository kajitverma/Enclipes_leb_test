package question1;
import java.util.HashSet;
import java.util.Set;
public class Book {
	
		public static void main(String[] args) 
		{
			 
		    Set<String> a = new HashSet<String>();
	        Set<String> b = new HashSet<String>();
	        Set<String> c = new HashSet<String>();
	        
	        a.add("Ajit kumar");
	        a.add("9608467891");
	        a.add("kajitkr@gmail.com");
	       
	        b.add("Deepak Kumar");
	        b.add("9867453423");
	        b.add("Deepak01org@gmail.com");
	        
	        //Duplicate input by the user
	        c.add("Ajit Kumar");
	        c.add("9608467891");
	        c.add("kajitkr@gmail.com");
	       
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
		}

	}

