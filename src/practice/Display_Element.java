package practice;
//import java.util.Scanner;

//Write a program to display elements between 100 to 200 (both numbers excluded) 
//ending with seven. {Hint: output-107,117,127….} 
public class Display_Element {

	public static void main(String[] args) {
		/*
		 * Scanner kb = new Scanner(System.in); System.out.print("Enter the ");
		*/
		for (int i = 100; i < 200; i++) {
			int a = i%10;
			if (a==7) {
				System.out.println("  =>"+i);
			}
			
		}
	}

}
