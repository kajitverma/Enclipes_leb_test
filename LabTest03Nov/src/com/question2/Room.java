package com.question2;

public class Room {
	private int roomNo;
	private String roomType;
	private boolean roomAC;
	private float roomArea;
	private float price;
	
	// default constructor
	public Room()
	{
		
	}
	
	// parameterized constructor for standard rooms with default price 3000;
	public Room(String roomType) {
		 
		this.price = 3000f;
	}
	
	// parameterized constructor with all parameters
	public Room(int roomNo, String roomType, boolean roomAC, float roomArea) {
		
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomAC = roomAC;
		this.roomArea = roomArea; 
	}

	  
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	// overloading the price method
	public void setPrice(float price, float discount) {
		this.price = price - (price * discount / 100);
	}
	
	
	// get final booking price
	
	public float getPrice() {
		return this.price;
	}
	
	
	
	
	
	

}
