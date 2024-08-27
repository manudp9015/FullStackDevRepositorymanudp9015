package com.programs.inheritamce;

class Employe
{	
	String empname;
	void meth1()
	{
		empname="goutham";
		System.out.println("employee name:"+empname);
	}
}
class Manager extends Employe
{	
	String empname;
	void meth1()
	{
		
		super.meth1();
		empname="rohith";
		System.out.println("manager name:"+empname);
	}
}
class Director extends Manager
{  
	String empname;
	void meth1()
	{
		
		super.meth1();
		empname="manu";
		System.out.println("director name:"+empname);
	}
}


public class Maindemomultilevel5
{
	public static void main (String args[])
	{
		Director o=new Director();
		o.meth1();
		
	}
}
