package Sagar;

import java.util.Scanner;

public class SagarDemo {
	int rollno;   //instant variable
	
	public void input() //method
	{	
		System.out.print("Enter roll no. : ");
		Scanner kb = new Scanner(System.in);
		rollno = kb.nextInt();
		
	}
	
	public void display()
	{	
		System.out.print("	=> roll no. : "+rollno);
	}
	
}