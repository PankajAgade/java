package practice;
/* Write a program to generate following pattern. 

* 
*** 
***** 
******* 
********* 
******* 
***** 
*** 
* 
*/
public class Star_Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,s;
		for(i=1;i<=10;i++) {
			for(j=1;j<=i;j++) {
				
				if(i==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("** ");
				}
			}
			System.out.println("");
		}
	}

}
