package com.question2;
//importing package
import java.util.Scanner;
public class HotelBooking
{
	// create menu to display Room type

	public static void roomType() 
	{
		 System.out.println("Room type....");
		 System.out.println("1. 3 Star Room.");
		 System.out.println("2. 5 Star Room");

	}
	//display room options
	private static void bookingType(int rType)
	{
		switch(rType)
		{
		case 1 : standerdRoom();
		break;
		case 2 : dulexRoom();
		break;
		default : System.out.println("Wrong input"); 
		}
	}
	// method of 3 star
	private static void standardRoom()
	{
		Room standard = new Room("3 star");
		System.out.println("Your room is booked :");
		System.out.println("pay the booking amount : "+standar.getPrice());
	}
	//method of 5 stare room 
	private static void dulexRoom()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("You want toAC room or not ?(y/n) :");
		char ch = sc.next().charAt(0);
		boolean ac = false;
		if(ch == 'y')
			ac = true;
		
		//declear dulex room price
		float price = 1000.56f;
		Room dulex = new Room(3500, "5 star ",ac,150.0f);
		
		
		dulex.setPrice(price);
		
		// printing the booking amount
				System.out.println("Booking amount :" + dulex.getPrice());
				// asking user have discount coupon or not 
				System.out.println("do you have a discount coupon? (y/n) ");
				ch = sc.next().charAt(0); 
				if(ch == 'y')
				{
					System.out.print("Enter discout(%) = ");
					float discount = sc.nextFloat();
					// set the discounted price
					dulex.setPrice(price, discount); 
				}
				 
				
				// print the left amount to pay 
				System.out.println("Your room is booked :");
				System.out.println("Pay the booking amount :" + dulex.getPrice());
				
				sc.close();
			}
			
			
			
			
			public static void main(String[] args) {
				 
				Scanner sc = new Scanner(System.in);
				 
			 
				// displaying the room option
				roomType();
				int roomType = sc.nextInt();
				// calling the booking method
				bookingType(roomType);
				 
				 
				
				sc.close();
			}
	}

