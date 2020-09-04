package departmentProgram;

import java.util.Scanner;

public class DepartmentMains {

	public static void main(String[] args) {
		String departmentName,HODname,MemberName,MemberQualification;	
		Scanner kb = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~ INPUT ~~~~~~~~~~~~~~~~");
		System.out.println("```````Department Input``````");
		
		System.out.print("Enter the department name : ");
		departmentName = kb.next();
		
		System.out.print("Enter the HOD name : ");
		HODname = kb.next();
		System.out.println();
		
		System.out.println("```````Staff Member Input``````");
		System.out.print("Enter the Member name : ");
		MemberName = kb.next();
		
		System.out.print("Enter the Member Qualification : ");
		MemberQualification = kb.next();
		System.out.println();
		
		Department obj = new Department(departmentName, HODname);
		obj.showDepartmentDetails();
		
		StaffMember obj1 = new StaffMember(MemberName, MemberQualification);
		obj1.showstaffMemberDetails();
	}

}
