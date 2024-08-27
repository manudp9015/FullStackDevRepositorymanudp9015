package com.program.assignment.abstractclass;

abstract class Animals
{
	static 
	{
		
		System.out.println("animals make sound");
		
	}
	
}
 class Dogs extends Animals
{
	
}

public class Maindemo2
{
	public static void main(String args[])
	{
		Dogs o=new Dogs();
		
	}
}
