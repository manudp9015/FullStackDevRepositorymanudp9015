package com.programs.inheritamce;

class Animal
{
	void meth1()
	{
		System.out.println("animal is superclass");
	}
}
class Dog extends Animal
{
	void meth2()
	{
		System.out.println("Dog is superclass");
	}
}
class StreetDog extends Dog
{
	void meth3()
	{
		System.out.println("streetdog is subclass");
	}
}


public class Maindemomultilevel 
{
	public static void main (String args[])
	{
		StreetDog o=new StreetDog();
		o.meth3();
		o.meth2();
		o.meth1();
	}
}
