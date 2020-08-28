import java.util.Scanner;

//2) Write a program to display whether a number is even or odd.
public class Even_Odd {

	public static void main(String[] args) {
		
		int num;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = kb.nextInt();
		
		if (num%2==0) {
			System.out.println("Given Number "+num+" is even.");
			
		} else {
			System.out.println("Given Number "+num+" is Odd.");
		}

	}

}
