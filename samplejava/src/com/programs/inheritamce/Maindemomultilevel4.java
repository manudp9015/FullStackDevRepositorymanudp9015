package com.programs.inheritamce;

class Animal4
{
	void meth1()
	{
		System.out.println("animal is superclass");
	}
}
class Dog4 extends Animal4
{	
	void meth1()
	{
		super.meth1();
		System.out.println("Dog is superclass");
	}
}
class StreetDog4 extends Dog4
{  
	
	void meth1()
	{
		super.meth1();
		System.out.println("streetdog is subclass");
	}
}


public class Maindemomultilevel4
{
	public static void main (String args[])
	{
		StreetDog4 o=new StreetDog4();
		o.meth1();
		
	}
}
