package inheritanceSquareProgram;

public class Rectangle extends Square{
	
	int length,breadth;
	
	public Rectangle()
	{
		
	}
	public void area()
	{
		int area;
		area = length * breadth;
		System.out.println("	Area of Rectangle : "+area);
	}
}
