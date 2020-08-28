/*WRITE A PROGRAM to print following Pattern 

* * * * * 
* * * * 
* * * 
* * 
* 

*/

public class Star_Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			
			for (int j = i; j < 6; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
