package arrayList;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
	public static void main(String [] args )
	{
		try(Scanner sc = new Scanner(System.in);
				OutputStream os = new FileOutputStream("D://ABC.txt"));
	}

}
