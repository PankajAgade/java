package practice;

import java.util.Scanner;

/*	Let us Assume and do the programming: An organization provides Diwali
bonus of 35% to their employees  If the year of service of that employee is 
more than 5 years and gives Diwali bonus of 15% to the employees if the year
of service is less than 5 years. Now Create a class and its respective methods
to enter the data from the user and calculate total salary of the employee.

*/
public class EmployeInput {
	int age,year,sallary,bonus;
	String name;
		
	public void input() //public static Person getDetails()
	{		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Name of Employe : ");
		name = kb.nextLine();  
	    		
		System.out.print("Enter the age of Employe : ");
		age = kb.nextInt(); 
	    
		System.out.print("How many Year of Working in Company : ");
		year = kb.nextInt(); 
		
		System.out.print("Enter the Sallary of Employe : ");
		sallary = kb.nextInt(); 		
	}
	
	public void calculateBonus()
	{	
		
		int totalSallary;
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~DISPLAY~~~~~~~~~~~~~~~~~~~");
		System.out.println("	Employe name is : "+name);
		System.out.println("	Employe age is  : "+age);
		System.out.println("	Employe Working year is : "+year);
		System.out.println("	Employe Sallary is : "+sallary);
		
		if (year>5) {
			//System.out.print(year);
			bonus = (35*sallary)/100;
			totalSallary = sallary + bonus;
			System.out.print("		=> Employe total sallary with bonus is : "+totalSallary);
			
		} else if (year<=5) {
			bonus = (15*sallary)/100;
			totalSallary = sallary + bonus;
			System.out.print("		=> Employe total sallary with bonus is : "+totalSallary);
		}
	}
}
