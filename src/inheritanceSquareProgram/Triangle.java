package inheritanceSquareProgram;

public class Triangle extends Rectangle {
	int base,height;
	
	public Triangle()
	{
		
	}
	
	public void area()
	{
		int area;
		area = (int) (0.5 * base * height);
		System.out.println("	Area of Rectangle : "+area);
	}


}
