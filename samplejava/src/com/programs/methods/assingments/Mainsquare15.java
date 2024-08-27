package com.programs.methods.assingments;


public class Mainsquare15 
{
	public static void main(String args[])
	{	
	
		int a[]=new int[15];
		for (int i=1;i<=15;i++)
		{
			a[i]=i*i;

		}
		for(int j=1;j<=a.length/2;j++)
		{
			System.out.println(a[j]);

		}
		
	}
}
