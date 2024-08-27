package com.assignment.String;
class demo2
{
	{
		String s="manu";
		String reverse="";
		int len=s.length();
		for (int i=len-1;i>=0;i--) 
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println("CharAt is used"+reverse);
		
		
		char S[]=s.toCharArray();
		String reverse2="";
		for (int i=len-1;i>=0;i--) 
		{
			reverse2=reverse2+S[i];
		}
		System.out.println("toCharArray used "+reverse2);
		

		String s1=s.substring(2,4);
		
		System.out.println("toCharArray used "+s1);
		
	}

}

public class Maindemo2
{
	public static void main (String []args)
	{
		demo2 o=new demo2();
	}
}
