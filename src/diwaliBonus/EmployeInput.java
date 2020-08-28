package diwaliBonus;

import java.util.Scanner;

/*	Let us Assume and do the programming: An organization provides Diwali
bonus of 35% to their employees  If the year of service of that employee is 
more than 5 years and gives Diwali bonus of 15% to the employees if the year
of service is less than 5 years. Now Create a class and its respective methods
to enter the data from the user and calculate total salary of the employee.

*/
public class EmployeInput {
	int age,year,sallary;
		String name;
		
	public int input()
	{
		
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Name of Employe : ");
		name = kb.nextLine();  
	    		
		System.out.print("Enter the age of Employe : ");
		age = kb.nextInt(); 
	    
		System.out.print("How many Year of Working in Company : ");
		year = kb.nextInt(); 
		
		System.out.print("Enter the Sallary of Employe : ");
		return sallary = kb.nextInt(); 
	    //System.out.print(name);		
	}
	
	public void calculateBonus(int sallary)
	{
		System.out.print(name);
	}
}
