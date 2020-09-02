package practice;
import java.util.Scanner;

public class Student {
	
	Scanner kb=new Scanner(System.in);
	
	public void RollNo() { //Methods(function)
		System.out.println("Enter roll no. : ");
		int r=kb.nextInt();
	}
	
	public void Name() {
		//String n=kb.nextLine();
		System.out.println("Enter name : ");
		char n = kb.next().charAt(10);
	}
	public static void main(String[] args) {
		
		// Create object
		// ClassName ObjectName = new ClassName();
		Student S1 = new Student();
		
		//access the class method 
		// objectName.methodName();
		S1.RollNo();
		S1.Name();
		

	}

}
