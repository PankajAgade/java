package inheritanceSquareProgram;

import java.util.Scanner;

public class TestMain {
	public static void main (String[] args )
	{
		Scanner kb = new Scanner(System.in);
		
		Square S = new Square();
		System.out.print("Enter Value of side : ");
		S.side = kb.nextInt();
		S.area();
		
		Rectangle R = new Rectangle();
		System.out.print("Enter Value of lenght : ");
		R.length = kb.nextInt();
		System.out.print("Enter Value of breadth : ");
		R.breadth = kb.nextInt();
		R.area();
		
		Triangle obj = new Triangle();
		System.out.print("Enter Value of base : ");
		obj.base = kb.nextInt();
		System.out.print("Enter Value of height : ");
		obj.height = kb.nextInt();
		obj.area();
		
	}
}
