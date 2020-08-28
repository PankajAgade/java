import java.util.Scanner;

//Write a program to develop a simple calculator application 
//and perform some basic operations
public class Simple_Calculatop {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		int num1,num2,x = 0,result;
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("");
		System.out.print("	Choise the above Operation : ");
		x = kb.nextInt();
		System.out.println("");
		
		System.out.print("Enter the value A : ");
		num1 = kb.nextInt();
		System.out.print("Enter the value B : ");
		num2 = kb.nextInt();
		System.out.println("");
		
		switch (x) {
		case 1:System.out.println("	```````Addition```````");
			result =num1+num2;
			System.out.println("		=>	"+num1+" + "+num2+" = "+result);
		break;
	
		case 2:System.out.println("	```````Subtraction```````");
			result =num1-num2;
			System.out.println("		=>	"+num1+" - "+num2+" = "+result);
		break;
	
		case 3:System.out.println("	```````Multiplication```````");
			result =num1*num2;
			System.out.println("		=>	"+num1+" * "+num2+" = "+result);
		break;
			
		case 4:System.out.println("	```````Division```````");
			result =num1/num2;
			System.out.println("		=>	"+num1+" / "+num2+" = "+result);
		break;
	
	
		default:
			System.out.println("Choice perfect option.");
			break;
		}
	}

}
