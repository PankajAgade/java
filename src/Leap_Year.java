import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		int num,result;
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter the year : ");
		num = kb.nextInt();
		result=num%4;
		if (result==0) {
			System.out.println("	=>  Entered year is Leap year. ");
		} else {
			System.out.println("	=>  Entered year is not Leap year. ");
		}
	}

}
