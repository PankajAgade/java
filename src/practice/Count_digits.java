package practice;
import java.util.Scanner;


public class Count_digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int num = kb.nextInt();
		int count=0;
		for (int i = 1; num !=0 ; i++) {
			num=num/10;
			
			count=count+1;
			
			
		}
		System.out.print("		digits => "+count);
	}

}
