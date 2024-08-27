package com.manu.test;
class demo5
{
	static 
	{
		System.out.println("static block1");
		
	}
	static 
	{
		System.out.println("static block2");
		
	}
	{
		System.out.println("execution occur in sequential order");

	}
}

public class Maindemo5 
{
	public static void main(String args[])
	{
		demo5 o=new demo5();
		
	}
}
