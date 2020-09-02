/*
	Create class Employee with constructors (default and parameterized),methods 
	(1 with return type (calculating salary), 
	1 without return type (displaying employeedata)).
*/
package constructors;

public class Employee {
	
	int salary;
	
	public Employee()
	{
		System.out.println("ABCD  Company");
	}
	
	    Employee (int tmpSalary) {
		salary = tmpSalary ;
		System.out.println("	Salary of the employee : "+salary);
	}

}
