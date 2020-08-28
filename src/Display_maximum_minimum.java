import java.util.Scanner;

//Write a program to display maximum number and minimum number between two numbers. 
public class Display_maximum_minimum {
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter The value of Num1 : ");
		int num1 = kb.nextInt();
		System.out.print("Enter The value of Num2 : ");
		int num2 = kb.nextInt();
		
		if (num1>num2) {
			System.out.println("=> The number "+num1+" is Maximum.");
			System.out.println("=> The number "+num2+" is Minimum.");
		}
		else if (num2>num1) {
			System.out.println("=> The number "+num2+" is Maximum.");
			System.out.println("=> The number "+num1+" is Minimum.");
		}
		
	}
}
