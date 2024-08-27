package com.programs.returnmethods;

class Array2
{
	short[] ArrayHalf(short a[])
	{
		int m=a.length;
		int n=a.length/2;
		short secondHalf[]=new short[n];
		int k=0;
		for(int i=n;i<m;i++)
		{
			secondHalf[k]=a[i];
			k=k+1;
		}
		return secondHalf;
		
	}
	
}
public class Mainsecondhalf
{
	public static void main(String args[])
	{
		short a[]= {10,20,30,40,50,60};
		Array2 o1=new Array2();
		short res[]=o1.ArrayHalf(a);
		for (int i=0;i<=res.length-1;i++)
		{
			System.out.println(res[i]+" ");
		}
		
	}

}
