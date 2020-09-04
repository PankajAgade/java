/*
 Q)	WRITE A PROGRAM for Department class having departmentName and HOD name 
    as instance variables,a constructor to initialize the variables and 
    showDepartmentDetails() to display the details.Create StaffMember class 
    having MemberName and MemberQualification as instance variables.Create 
    the constructor and showstaffMemberDetails() method to display the details.
*/
package departmentProgram;

public class Department {
	String departmentName,HODname;
	
	public Department(String departmentName, String HODname)
	{
		this.departmentName = departmentName;
		this.HODname = HODname;
	}
	
	public void showDepartmentDetails()
	{
		System.out.println();
		System.out.println("~~~~~~~~ Department Details ~~~~~~~");
		System.out.println("	=> The department name : "+departmentName);
		System.out.println("	=> The HOD name : "+HODname);
	}
}
