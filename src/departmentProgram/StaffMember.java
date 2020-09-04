package departmentProgram;

public class StaffMember {
	String MemberName,MemberQualification;
	
	public StaffMember(String MemberName,String MemberQualification)
	{
		this.MemberName = MemberName;
		this.MemberQualification = MemberQualification;
	}
	
	public void showstaffMemberDetails()
	{
		System.out.println();
		System.out.println("~~~~~~~~ Staff Member Details ~~~~~~~");
		System.out.println("	=> The Member name : ");
		System.out.println("	=> The Member Qualification : ");
	}
}
