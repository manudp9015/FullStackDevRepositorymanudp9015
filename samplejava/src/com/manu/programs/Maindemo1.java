package com.manu.programs;

class isprime
{
	boolean isprime(int num)
	{
		boolean prime=true;
		for(int i=2;i<num;i++)
		{
			
			if(num%i==0)
			{
				prime=false;
				break;
			}
			
		}
		if(prime==true) return true;
		else return false;
		
		
	}
}
public class Maindemo1 
{
  public static void main (String args[])
  {
	  isprime o=new isprime();
	boolean val=o.isprime(27);
	System.out.println(val);
	for(int i=50;i<100;i++)
	{
		if(o.isprime(i)==true)
			
		{
			System.out.println(i+" ");

		}
	}
		System.out.println();
		for(int i=50;i>1;i--)
		{
			if(o.isprime(i)==true)
				
			{
				System.out.println(i+" ");

			}
			
		}
		System.out.println();
		int count=0;
		for(int i=100;i<200;i++)
		{
			if(o.isprime(i)==true)
				
			{
				count=count+1;
			

			}
			
		}
		System.out.println(count);

		
  }
}
