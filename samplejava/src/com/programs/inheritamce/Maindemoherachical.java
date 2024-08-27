package com.programs.inheritamce;

class Animal3
{
	void meth1()
	{
		System.out.println("animal is superclass");
	}
}
class Dog3 extends Animal3
{
	void meth2()
	{
		System.out.println("Dog is subclass of nimal superclass");
	}
}
class Cat3 extends Animal3
{
	void meth3()
	{
		System.out.println("cat is subclass of animal superclass");
	}
}
class Pig3 extends Animal3
{
	void meth4()
	{
		System.out.println("pig is subclass of animal");
	}
}



public class Maindemoherachical
{
	public static void main (String args[])
	{
		Dog3 o=new Dog3();
		o.meth2();
		o.meth1();
		Cat3 o1=new Cat3();
		o1.meth3();
		o1.meth1();
		Pig3 o2=new Pig3();
		o2.meth4();
		o2.meth1();
		
		
		
		

	}
}
