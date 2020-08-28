import java.util.Scanner;

//1) Write a program to display maximum among three numbers.
public class DisplayMaximum {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the value of num1 : ");
		num1 = kb.nextInt();
		
		System.out.println("Enter the value of num2 : ");
		num2 = kb.nextInt();
		
		System.out.println("Enter the value of num3 : ");
		num3 = kb.nextInt();
		
		if (num1>num2 && num1>num3) 
		{
			System.out.println("Mximum number is num1 : "+num1);
		}
		else if (num2>num1 && num2>num3) 
		{
			System.out.println("Mximum number is num1 : "+num2);
		}
		else if (num3>num1 && num3>num2) 
		{
			System.out.println("Mximum number is num1 : "+num3);
		}
		
		
	}

}
