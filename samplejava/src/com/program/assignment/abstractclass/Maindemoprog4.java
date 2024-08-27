package com.program.assignment.abstractclass;

abstract class Maths
{
	abstract int add(int a ,int b);
	
}
 class Calci extends Maths
{
	   int add(int a ,int b)
		{
		
			int c=a+b;
			return c;
			
		}
}

public class Maindemoprog4
{
	public static void main(String args[])
	{
		Calci o=new Calci();
		int val=o.add(2,3);
		System.out.println("value is="+val);
		
		
	}
}
