package inheritance;

public class Employee extends Worker {

		public static void main (String [] args)
		{
			String workSpecialization = "Driver";
			Worker ob = new  Worker();
			ob.name= "prajwal";
			ob.address= "nagpur";
			ob.age=23;
			ob.phoneNumber=12369;
			ob.salary= 5000;
			
			ob.displaySalary();
			System.out.println("Work = "+workSpecialization);
			
		}
}
