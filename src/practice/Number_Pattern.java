package practice;
/*WRITE A PROGRAM to print following Pattern 

1 2 3 45 
2 3 4 5 
3 4 5 
45 
5 
45 
3 4 5 
2 3 4 5 
1 2 3 45 

*/
public class Number_Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			
			for (int j = i; j < 6; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		for (int i =4 ; i >= 1; i--) {
			
			for (int j = i; j <= 5; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}

		


	}

}
