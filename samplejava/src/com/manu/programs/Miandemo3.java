package com.manu.programs;


class calci
{
	int add(int a ,int b)
	{
		int res=a+b;
		return res;
		
		
	}

	int sub(int a ,int b)
	{
		int res=a-b;
		return res;
		
		
	}

	int mul(int a ,int b)
	{
		int res=a*b;
		return res;
		
		
	}
}
public class Miandemo3 
{
	public static void main(String args[])
	{
		calci o=new calci();
		int a=	o.add(2, 3);
		int b=o.sub(3, 2);
		int c=o.mul(a,b);
		System.out.println(c);
		
	}
}
