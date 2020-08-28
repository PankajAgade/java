/* Write a program to print following Pattern 

* 
* * 
* * * 
* * * * 
* * * * * 

*/
public class star_pattern_1 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			System.out.println("");
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
		}
	}
}
