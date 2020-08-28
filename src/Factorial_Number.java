import java.util.Scanner;

//Write a program to find factorial of a number. 
public class Factorial_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter The Factorial number : ");
		int num = kb.nextInt();
		int fact=1;
		for (int i = 1; i <= num; i++) {
			fact=i*fact;
		}
		System.out.print("	=> The Given number Factorial is : "+fact);
	}

}
