import java.util.Scanner;

//Write a menu driven program to find all prime, 
//even and odd numbers between 1 to 100.
public class Even_Odd_prime_SwitchStatement {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		int i;
		System.out.println("1. Even");
		System.out.println("2. Odd");
		System.out.println("3. Prime");
		System.out.println("");
		System.out.print("	Choise the above Operation : ");
		i = kb.nextInt();
		System.out.println("");
		System.out.println("");
		
		switch (i) {
		case 1:
			System.out.println("	~~~~~ Even Number ~~~~~");
			for (int j = 1 ; j <= 100 ; j++) {
				if (j%2==0) {
					System.out.println("	=> "+j);
				}
			}
			break;
			
		case 2:
			System.out.println("	~~~~~ Odd Number ~~~~~");
			for (int j = 1 ; j <= 100 ; j++) {
				if (j%2 != 0) {
					System.out.println("	=> "+j);
				}
			}
			break;
	
		case 3:
			System.out.println("	~~~~~ Prime Number ~~~~~");
			for (int j = 1 ; j <= 100 ; j++) {
				if (j%2==0) {
					//System.out.println("	=> "+j);
				}
			}
			break;
	

		default:
			break;
		}
	}

}
