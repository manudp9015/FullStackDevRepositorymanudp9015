package com.assignment.String;
class demo8
{
	{
		String s=new String("program");
		int len=s.length();
		for (int i=0;i<=len;i++) 
		{
			
			String s1=s.substring(0,i);
			System.out.println(s1);
		}
		for (int i=len-1;i>=0;i--) 
		{
			String s2=s.substring(0,i);
			System.out.println(s2);
		}	
	}

}


public class Maindemo8 
{
	public static void main (String []args)
	{
		demo8 o=new demo8();
	}

}

