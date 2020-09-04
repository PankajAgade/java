/*
Q) Define a class named Square as shown below:
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

package inheritanceSquareProgram;

public class Square {


	public int side;
	public void area()
	{
		int area;
		area = side*side;
		System.out.println("	Area of Square : "+area);
	}
	public Square()
	{
		
	}
}
