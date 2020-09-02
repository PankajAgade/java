package practice;
import java.util.Scanner;

//Write a program to find sum of all digits of a number entered by the user. 
public class Sum_of_Digits {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int num = kb.nextInt();
		int sum;
		for (sum =0; num!=0 ; num/=10) {
			 num=num%10;
			 sum=sum+num;
			 System.out.println("	=> "+sum);
		}
		System.out.println("	Total => "+sum);
		

	}

}
