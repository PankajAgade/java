package inheritance;

public class Manager extends Worker{

	public static void main (String [] args)
	{
		String department = "Manager";
		Worker ob = new  Worker();
		ob.name= "pankaj";
		ob.address= "nagpur";
		ob.age=23;
		ob.phoneNumber=12369;
		ob.salary= 50000;
		
		ob.displaySalary();
		System.out.println("Work = "+department);
	}
}
