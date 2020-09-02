package practice;
import java.util.Scanner;

//Write a program to display even and odd numbers between a range entered by the user
public class Range_Even_Odd {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter The Start : ");
		int s = kb.nextInt(); 
		System.out.print("Enter The End   : ");
		int e = kb.nextInt();
		for (int i = s; i <= e; i++) {
			if (i%2==0) {
				System.out.println("		"+i+" => Even");
			}
			else
			{
				System.out.println("		"+i+" => Odd");
			}
		}
	}

}
