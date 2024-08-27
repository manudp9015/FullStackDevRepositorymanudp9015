package com.manu.programs;

class array1d
{
	int[] getarray(int a[])
	{
		int[]half=new int[a.length];
		for(int i=0;i<a.length/2;i++)
		{
			half[i]=a[i];
		}
		return half;
	}
}
public class Maindemo5
{
	public static void main(String[] args) 
	{
		array1d o=new array1d();
		int a[]= {10,20,30,40};
		
		o.getarray(a);
		int sum=0;
		for(int i=0;i<a.length/2;i++)
		{
			sum=sum+a[i];

		}
		System.out.println(sum);
	}

}
