package com.oopstest;


abstract class demo3
{
	static void parent()
	{
		System.out.println("satic block");
		
	}
	
	{
		System.out.println("instance block");

	}
}
 class demo3child extends demo3
{
	void child() 
	{
		demo3.parent();
	}
}

public class Maindemo3 
{
	public static void main(String args[])
	{
		demo3child o=new demo3child();
		o.child();
	}
}

