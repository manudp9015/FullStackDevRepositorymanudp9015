package com.manu.test;
class demo
{
	{
		System.out.println("instance bolck");
		
	}
	demo()
	{
		System.out.println("constructor bolck");

	}
}

public class Maindemo1 
{
	public static void main (String args[])
	{
		demo o= new demo();
		
	}
}
