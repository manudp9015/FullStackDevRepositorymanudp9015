package com.gentech.programs.outerinnerclass;

class Outer2
{
	static int age;
	static  String name;
	Inner2 innerobj1=new Inner2();
	
	static class Inner2
	{
		static void person()
		{
			age=22;
			name="manu";
			System.out.println("Age:"+age);
			System.out.println("Name:"+name);
		}	
	}
}

public class Maininnerouterclas2
{
	public static void main (String args[])
	{
		Outer2 outerobj1=new Outer2();
		Outer2.Inner2.person();	
	}
}
