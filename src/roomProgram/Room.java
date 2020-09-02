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
	Scanner kb = new Scanner(System.in);
	
	public Room() {
		
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
		System.out.println("	Cost of WhiteWash => "+cost);
		flooringCost();
	}
	public void flooringCost()
	{
		int x;
		int areaCeiling = length * width;
		System.out.println("	Select option Which floor");
		System.out.println("	1) geometric flooring.");
		System.out.println("	2) cement flooring.");
		System.out.print("		Enter the option : ");
		x = kb.nextInt();
		
		switch (x)
		{
		case 1:
			int flooringCost1 = areaCeiling * 200;
			System.out.print("		Flooring Cost is : "+flooringCost1);
			break;
			
		case 2:
			int flooringCost2 = areaCeiling * 100;
			System.out.print("		Flooring Cost is : "+flooringCost2);
			break;

		default:
			break;
		}
	}
	
}
