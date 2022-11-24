package arrayList;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		ArrayList<Integer> al2= new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al2.add(6);
		al2.add(7);
		al2.add(8);
		al2.add(9);
		
		System.out.println("Size : "+ al.size());
		System.out.println("Element of First Array :"+al);
		System.out.println("Size : "+ al2.size());
		System.out.println("Element of Second Array :"+al2);
		al2.addAll(al);
		System.out.println("After adding Array --");
	
		
		
		
	}

	private static String contanins(ArrayList<Integer> al, ArrayList<Integer> al2) {
		// TODO Auto-generated method stub
		return null;
	}

}
