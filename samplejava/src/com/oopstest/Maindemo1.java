package com.oopstest;

class demo1
{
	demo1(int a)
	{
	
		System.out.println(a);
	}
}
class demo1child extends demo1
{

	demo1child(int a,int b) 
	{
		super(a);
		
		System.out.println(b);	
	}
}
	
class demo1grandchild extends demo1child
{

	demo1grandchild(int a, int b) 
	{
		super(a, b);
	}
	
}


public class Maindemo1 
{
	public static void main(String args[])
	{
		demo1grandchild o=new demo1grandchild(10,20);
	}
}
