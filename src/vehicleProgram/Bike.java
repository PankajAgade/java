package vehicleProgram;

import java.util.Scanner;

public class Bike extends Vehicle {

	int discountRate;
	public Bike()
	{
		
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print(" Enter Vehicle Name : ");
		vehicleName = kb.next();
		
		System.out.print(" Enter Vehicle Model Number : ");
		vehicleModelNumber = kb.nextInt();
		
		System.out.print(" Enter Vehicle Price : ");
		vehiclePrice = kb.nextInt();
		
		System.out.print(" Enter Vehicle Service Station Name : ");
		serviceStationName = kb.next();
		
	}
	public void discount()
	{	
		int discountAmount = (10*vehiclePrice)/100;
		discountRate = vehiclePrice - discountAmount;
		System.out.println("	For this vehicle Discount is 10 %.");
		System.out.println("	The Discount Price of Bike : "+discountRate);

	}

}
