package com.programs.inheritamce;
class College
{
	College(String cname)
	{
		System.out.println("college Name :"+cname);
		
	}
}
class Department extends College
{
	
	Department(String cname,String deptName)
	{
		super(cname);
		System.out.println("Department :"+deptName);
	}
}
class Employee extends Department
{
	String ename;
	Employee(String cname,String deptName,String ename)
	{
		super(cname,deptName);
		
		System.out.println("employee:"+ename);
	}
}
	

public class Maindemomultilevel2 
{
	public static void main(String args[])
	{
		Employee o=new Employee("GECK","CS","MANU");
		
	}

}
