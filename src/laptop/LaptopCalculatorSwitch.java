package laptop;

import java.util.Scanner;

public class LaptopCalculatorSwitch {
	int choic;
		public void option()
		{
			System.out.println("	1) Addition");
			System.out.println("	2) Subtraction");
			System.out.println("	3) Multiplication");
			System.out.println("	4) Exit");
			
			System.out.print("Enter Option : ");
			Scanner kb = new Scanner(System.in);
			choic = kb.nextInt();
			//return choice;
			calculator(choic);
		}
		

		public void calculator(int choice)
		{
			if (choice == 1) {
				addition();
				option();
			} 
			else if(choice == 2 )
			{
				Subtraction();
				option();
			}
			else if(choice == 3)
			{
				Multiplication();
				option();
			}
			else if(choice == 4)
			{
				Exit();
			}
			
		}
		
		public void addition()
		{
			int num1,num2,result;
			System.out.print("Enter the value of first number : ");
			Scanner kb = new Scanner(System.in);
			num1 = kb.nextInt();
			System.out.print("Enter the value of first number : ");
			num2 = kb.nextInt();
			result = num1 + num2;
			System.out.println("		=>	"+num1+" + "+num2+" = "+result);
			System.out.println("`````````````````````````````````````````````````````````````````");
			
		}
		public void Subtraction()
		{
			int num1,num2,result;
			System.out.print("Enter the value of first number : ");
			Scanner kb = new Scanner(System.in);
			num1 = kb.nextInt();
			System.out.print("Enter the value of first number : ");
			num2 = kb.nextInt();
			result = num1 - num2;
			System.out.println("	=>	"+num1+" - "+num2+" = "+result);
			System.out.println("`````````````````````````````````````````````````````````````````");
			
		}
		public void Multiplication()
		{
			int num1,num2,result;
			System.out.print("Enter the value of first number : ");
			Scanner kb = new Scanner(System.in);
			num1 = kb.nextInt();
			System.out.print("Enter the value of first number : ");
			num2 = kb.nextInt();
			result = num1 * num2;
			System.out.println("	=>	"+num1+" * "+num2+" = "+result);
			System.out.println("`````````````````````````````````````````````````````````````````");
			
		}
		public void Exit()
		{
			System.out.print("	~~~~~~~~ EXIT ~~~~~~~~");
		}


		
		
}
