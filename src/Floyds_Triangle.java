/*Write a program in Java to print the Floyd's Triangle. 

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/
public class Floyds_Triangle {

	public static void main(String[] args) {
		int i,j,s=0;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				s++;
				//System.out.print(s+" ");
				
				  if (s%2==0)
				  {
					  System.out.print("0"+" "); 
				  } 
				  else 
				  { 
					  System.out.print("1"+" ");
				  }
				 
			}
			System.out.println("");
		}

	}

}
