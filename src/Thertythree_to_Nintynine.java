/* Write a program which prints 33 to 999. The numbers should be displayed as: 
i. For multiples of 3 print "PINK" instead of the number 

ii. For the multiples of five print "YELLOW". 

iii. For numbers which are multiples of both three and five print "PINK & YELLOW". 

Also print count of how many times “PINK” was printed, “YELLOW” was printed and “PINK & YELLOW “was printed. 											


*/
public class Thertythree_to_Nintynine {
	
	public static void main(String[] args) {
		int p=0,y=0,py=0;
		for (int i = 33; i <= 999; i++) {
			if (i%3==0) {
				System.out.println("PINK");
				p++;
			}
			if (i%5==0) {
				System.out.println("YELLOW");
				y++;
			} 
			if (i%3==0 && i%5==0) {
				System.out.println("PINK & Yellow");
				py++;
			} 
		}
		System.out.println("	PINK          => "+p);
		System.out.println("	YELLOW        => "+y);
		System.out.println("	PINk &YELLOW  => "+py);


	}

}
