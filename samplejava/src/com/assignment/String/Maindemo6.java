package com.assignment.String;
class demo6
{
	{
		String s=new String("gadag");
		String reverse=new String("");
		int len=s.length();
		for (int i=len-1;i>=0;i--) 
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println("CharAt is used:"+reverse);
		System.out.println("CharAt is used:"+s);

		if(s.equals(reverse))
		{
			System.out.println("it is palindrome");
			
		}
		else
		{
			System.out.println("it is not palindrome");

		}
	}
}


public class Maindemo6 {
	public static void main (String []args)
	{
		demo6 o=new demo6();
	}

}
