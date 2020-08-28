/*Write a program to print following Pattern 

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
*/

public class Number_Pattern_3 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}
