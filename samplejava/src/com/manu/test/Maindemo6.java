package com.manu.test;
 class demo61
{
	static 
	{
		System.out.println("static block1");
		
	}
	
	
}
class demo62
{
	static 
	{	demo61 o=new demo61();
	
		System.out.println("static block2");
		
	}
}

public class Maindemo6
{
	public static void main(String args[])
	{
		demo62 o1=new demo62();
		
	}
}
