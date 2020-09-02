package practice;
import java.util.Scanner;

//Write a program to display whether the triangle is equilateral, isosceles or scalene triangle.
public class Triangle {

	public static void main(String[] args) {
		int s1,s2,s3;
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter the value of side 1 : ");
		s1 = kb.nextInt();
		System.out.print("Enter the value of side 2 : ");
		s2 = kb.nextInt();
		System.out.print("Enter the value of side 3 : ");
		s3 = kb.nextInt();
		
		if (s1==s2 && s1==s3)
		{
			System.out.print(" => This Tringle is equilateral Trangle.");
		} 
		else if (s1==s2 || s1==s3)
		{
			System.out.print(" => This Tringle is Isosceles Trangle.");
		}
		else
		{
			System.out.print(" => This Tringle is scalene Trangle.");
		}
	}

}
