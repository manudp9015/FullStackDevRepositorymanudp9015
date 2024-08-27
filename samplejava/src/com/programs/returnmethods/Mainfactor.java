package com.programs.returnmethods;

class Fact
{
	int fact(int n)
	{
		int fact1=1;
		for (int i=1;i<=n;i++)
		{
			fact1=fact1*i;
		}
		return fact1;
	}
	
}

public class Mainfactor 
{
	public static void main(String args[])
	{
		int n=3;
		Fact o1=new Fact();
		int res=o1.fact(n);
		
		System.out.println(res+" ");
		
		
	}

}
