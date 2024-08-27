package com.manu.programs;


class calci4
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

	void mul()
	{
		int a=this.add(2, 3);
		int b=this.sub(3, 2);
		int c =a*b;
		System.out.println(c);
	}
}
public class Maindemo4
{
	public static void main(String args[])
	{
		calci4 o=new calci4();
		o.mul();
		
		
	}
}
