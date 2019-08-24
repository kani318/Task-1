package org.college;

public class Dept extends Hostel {
	String dname;
	public void deptName() {
		System.out.println("Department Name:"+dname);
	}
	public static void main(String[]args) {
		Dept obj=new Dept();
		obj.Name="Anna University";
		obj.Code=9214;
		obj.Rank=4;
		obj.sname="Anams";
		obj.sdept="M.Tech";
		obj.sid="AU007";
		obj.hname="Anna Hostel";
		obj.dname="IT";
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.hostelName();
		obj.deptName();
				
	}

}
