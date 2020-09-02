package practice;
//Write a program to check and display if a given number is palindrome or not. 
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int num,remainder,check = 0,temp;
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		num = kb.nextInt();
		temp = num;
		for (; num !=0 ;num=num/10 ) {
			remainder = num % 10;
			check = check * 10 + remainder;
			
		}
		if (check == temp) {
			System.out.print("Given Number "+temp+" is Palindrome.");
		}
		else
		{
			System.out.print("Given Number "+temp+" is Not Palindrome.");
		}
	}

}
