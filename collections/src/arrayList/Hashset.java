package arrayList;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Hashset 
{
	public static void main (String[] args)
	{
		Set<Integer>s= new TreeSet<>();
		Set<Integer>s2= new TreeSet<>();
		s.add(11);
		s.add(22);
		s.add(33);
		s.add(44);
		System.out.println("set 1");
		System.out.println(s);
		s2.add(55);
		s2.add(66);
		s2.add(77);
		s2.add(88);
		s.addAll(s2);
		System.out.println("set 2 ");
		System.out.println(s2);
		System.out.println(" After added all set");
		s.addAll(s2);
		System.out.println(s2);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
	}

}
