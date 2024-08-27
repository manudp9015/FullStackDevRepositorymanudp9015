package com.programs.inheritamce;

class Animal2
{
	void meth1()
	{
		System.out.println("animal is superclass");
	}
}
class Dog2 extends Animal2
{
	void meth2()
	{
		System.out.println("Dog is superclass");
	}
}
class Cat2 extends Animal2
{
	void meth3()
	{
		System.out.println("Dog is superclass");
	}
}
class StreetDog2 extends Dog2
{
	void meth4()
	{
		System.out.println("streetdog is subclass");
	}
}


public class Maindemohybrid
{
	public static void main (String args[])
	{
		StreetDog2 o=new StreetDog2();
		o.meth4();
		o.meth2();
		o.meth1();
		Cat2 o1=new Cat2();
		o1.meth1();
		o1.meth3();
		

	}
}
