package com.programs.returnmethods;
class Array3
{
	double[] Arrayreverse(double a[])
	{
		int n=a.length;
		double doublereverse[]=new double[n];
		for(int i=n-1;i>=0;i--)
		{
			doublereverse[i]=a[i];
		}
		return doublereverse;
		
	}
	
}
public class Mainarrayreverse 
{
	public static void main(String args[])
	{
		double a[]= {10,20,30,40};
		Array3 o1=new Array3();
		double res[]=o1.Arrayreverse(a);
		for (int i=res.length-1;i>=0;i--)
		{
			System.out.println(res[i]+" ");
		}
		
	}

}
