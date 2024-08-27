package com.assignment.String;
class demo7
{
	{
		String s=new String("program");
		int len=s.length();
		char ch[]=new char[len];
		for (int i=0;i<len;i++) 
		{
			
			ch[i]=s.charAt(i);
			System.out.println(ch);
		}
	}
	
}


public class Maindemo7 {
	public static void main (String []args)
	{
		demo7 o=new demo7();
	}

}

