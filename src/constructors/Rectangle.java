/*
Q=>	Create a class named 'Rectangle 'with two data members- length and breadth 
	and a method to calculate the area which is 'length*breadth'. The class has
 	three constructors which are:
	1	- having no parameter - values of both length and breadth are assigned 
	 	  zero.
	 	  
	2	- Having two numbers as parameters - the two numbers are assigned as 
		  length and breadth respectively.
		  
	3	- Having one number as parameter - both length and breadth are assigned
	 	  that number.
	Now, create objects of the 'Rectangle' class having none, one and two 
	parameters and print their areas.
*/

package constructors;

public class Rectangle {
	int length,breadth;
	
	public void calculate()
	{
		int area = length * breadth ;
		System.out.println(" => Area of Rectangle : "+area);
	}
	
	public Rectangle()
	{
		length=0;
		breadth=0;
		calculate();
	}
	
	public Rectangle(int tempLength, int tempBreadth)
	{
		length = tempLength;
		breadth = tempBreadth;
		calculate();
	}
	
	public Rectangle(int side)
	{
		length = side;
		breadth = side;
		calculate();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
