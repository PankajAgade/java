import java.util.Scanner;

public class employe {
	Scanner pa=new Scanner(System.in);
	//Scanner pa=new Scanner(System.in);
	
	public void id() { //create methods (function)
			System.out.println("Enter the id of employe : ");
			int id=pa.nextInt();
		}
	public void age() {
		System.out.println("Enter the age of employe : ");
		int age=pa.nextInt();
	}
	public void name() {
		System.out.println("Enter the name of employe : ");
		char name=pa.next().charAt(10);
	}
	
	public static void main(String[] args) {
		
		//create new object    object objectName= new className();
		employe employe1 = new employe();
		employe1.id();  //access the method (function) to object (employe1)
		employe1.age();
		employe1.name();
	}

}
