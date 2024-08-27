package com.programs.inheritamce;
class College3
{
	College3(String cname)
	{
		System.out.println("college Name :"+cname);
		
	}
	College3(int code)
	{
		System.out.println("code :"+code);
		
	}
	
}
class Department3 extends College3
{
	
	Department3(String cname,String deptName)
	{
		super(cname);
		System.out.println("Department :"+deptName);
	}
	Department3(int code)
	{
		super(code);
		
	}
}
class Employee3 extends Department3
{
	String ename;
	Employee3(String cname,String deptName,String ename)
	{
		super(cname,deptName);
		
		System.out.println("employee:"+ename);
	}
	Employee3(int code)
	{
		super(code);
		
	}
}
	

public class Maindemomultilevel3
{
	public static void main(String args[])
	{
		Employee3 o=new Employee3("GECK","CS","MANU");
		Employee3 o2=new Employee3(420);
		
	}

}
