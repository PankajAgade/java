/*
Q)	Define a class named Vehicle as described below:
	i)	Data Members:
		a.	vehicle name
		b.	vehicle model number
		c.	vehicle price
		d.	service station name
	ii)	Methods:
		a.	Constructor
		b.	Display() method to display all the details of class Vehicle .
	iii)	Define another class named Bike that extends the class Vehicle.
		a.	Data Members: discountRate
		b.	Constructor
		c.	Methods:display() to display bike name,bike model number,bike price,
			service station name,discount rate.
	iv)	Discount() method to compute the discount.
	v)	Create an object for the class Bike and test it.

	1. Define a class named Square as shown below:
		i)	Data Member: side
		ii)	Methods: area() 
		iii)	Constructor.
		iv)	Define another class Rectangle that extends class Square
			a.	Data Member: length,breadth
			b.	Constructor.
			c.	Methods: area()
	v)	Define one more class named Triangle that extends the class Rectangle
		a.	Data Member: side1,side2,side3
		b.	Constructor
		c.	Methods: area()
	vi)	Create objects for the classes Square,rectangle and Triangle.Test them.
*/

package vehicleProgram;

public class Vehicle {
	String vehicleName,serviceStationName;
	int vehicleModelNumber,vehiclePrice;
	
	public Vehicle() {
		
	}
	public void Display()
	{
		System.out.println("Vehicle Name : "+vehicleName);
		System.out.println("Vehicle Model Number : "+vehicleModelNumber);
		System.out.println("Vehicle Price : "+vehiclePrice);
		System.out.println("Vehicle Service Station Name : "+serviceStationName);
		
	}
}
