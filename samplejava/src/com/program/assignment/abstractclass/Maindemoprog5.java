package com.program.assignment.abstractclass;

abstract class Employe
{	
	
	abstract void meth1();
	String empname="goutham";
	void emp()
	{
		System.out.println("employee name:"+empname);
	}
}
abstract class Manager extends Employe
{	

	abstract void meth3();
	String manname="rohith";
	void meth1()
	{
		
		System.out.println("manager name:"+manname);
	}
}
class Director extends Manager
{  
	String dirname="manu";
	void meth3()
	{
		System.out.println("director name:"+dirname);
	}
}


public class Maindemoprog5
{
	public static void main (String args[])
	{
		Director o=new Director();
		o.meth3();
		o.meth1();
		o.emp();
		
	}
}

