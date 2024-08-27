package com.programs.inheritamce;

class HCollege
{
	HCollege(String cname)
	{
		System.out.println("college Name :"+cname);
		
	}
}
class HDepartment extends HCollege
{
	
	HDepartment(String cname,String deptName)
	{
		super(cname);
		System.out.println("Department :"+deptName);
	}
}
class HCsdept extends HCollege
{
	
	HCsdept(String cname,String deptName)
	{
		super(cname);
		System.out.println("Department :"+deptName);
	}
}
class HEmployee extends HDepartment
{
	String ename;
	HEmployee(String cname,String deptName,String ename)
	{
		super(cname,deptName);
		
		System.out.println("employee:"+ename);
	}
}
	

public class Maindemohybrid2 
{
	public static void main(String args[])
	{
		HEmployee o=new HEmployee("GECK","CS","MANU");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		HCsdept o1=new HCsdept("GECK","MECH");
		
	}

}



