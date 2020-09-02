/*
Write a program and perform the following:
	a)	Define class “ROOM”.
	b)	Define data Members as :
		i.	Length
		ii.	Width
		iii.Height
	c)	Define constructors as per requirement.
	d)	Define methods as :
		i.	Float whiteWashingArea() to compute the area to be whitewashed.
		ii.	Int whiteWashingCost() to compute the cost of whitewashing 
			at the rate of Rs.80 per sq.ft
		iii. Int flooringCost() to compute the cost of flooring at the rate 
			of Rs200/-sq.ft for geometric flooring and at the rate of 
			Rs100 /- sq.ft for cement flooring.
		iv.	Test this class by creating an object for the class Room and 
			compute the cost for respective methods.
*/
package roomProgram;

import java.util.Scanner;

public class Room {
	int length,width,height;
	
	public Room() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the lenghth of WhiteWash : ");
		length = kb.nextInt();
		
		System.out.print("Enter the Width of WhiteWash : ");
		width = kb.nextInt();
		
		System.out.print("Enter the height of WhiteWash : ");
		height = kb.nextInt();
		
	}
	
	public void whiteWashingArea() 
	{
		int areaWalls = 2*(length + width)*height;
		int areaCeiling = length * width;
		
		float areaWhiteWash = areaWalls + areaCeiling;
		
		System.out.println("	Area of WhiteWash => "+areaWhiteWash);
		//return areaWhiteWash;
		whiteWashingCost(areaWhiteWash);
	}
	
	public void whiteWashingCost(float areaWhiteWash) 
	{
		int cost = (int) (areaWhiteWash * 80) ;
		System.out.println("	Cost of WhiteWash => "+areaWhiteWash);
		flooringCost();
	}
	public void flooringCost()
	{
		int areaCeiling = length * width;
		System.out.println("Select option Which floor");
	}
	
}
