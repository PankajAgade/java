package studentVar;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
Write a program to create a class Student and do the following:
	a. Create a method to input data (rollNo, Name, contactNo, Total marks)
	b. Create another method to display the data of Student class.
	c. Create object of Student class and access these methods main method 
	   of a new class – StudentDemo.java.
*/
public class Student {
	int rollNo,contactNo,totalMark;
	String name;
	
	public void input()
	{	
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the roll no. : ");
		rollNo = kb.nextInt();
		
		System.out.print("Enter the name  : ");
		name = kb.next();
		//name = kb.next().chars();
		
		System.out.print("Enter the contact number : ");
		contactNo = kb.nextInt();
		
		System.out.print("Enter the Total marks : ");
		totalMark = kb.nextInt();
		display();
	}
	
	public void display()
	{
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~Student Data~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("	Name        = "+name);
		System.out.println("	Roll no.    = "+rollNo);
		System.out.println("	Contact no. = "+contactNo);
		System.out.println("	Total marks = "+totalMark);
		
	}
}
