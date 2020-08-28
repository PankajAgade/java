import java.util.Scanner;

public class Display_posv_negv_zero {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter The number : ");
		int num = kb.nextInt();
		
		if (num==0)
		{
			System.out.println("The given number "+num+" is Zero.");
		}
		else if (num>0)
		{
			System.out.println("The given number "+num+" is Positive.");
		}
		else
		{
			System.out.println("The given number "+num+" is Negative.");
		}
		
	}

}
