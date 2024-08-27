package com.manu.programs;

class maths
{
	int[][] matadd(int [][]a,int [][]b)
	{
		int[][]res=new int[a.length][a[0].length];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		return res;
	}
}

public class Maindemo2 
{
	public static void main(String args[])
	{
		maths o=new maths();
		int a[][]={{10,20,30},{40,50,60}};
		int b[][]= {{10,20,30},{40,50,60}};
		int c[][]=o.matadd(a,b);
		for (int i=0;i<a. length                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.println(c[i][j]);
			}
			
		}
		System.out.println();
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				sum=sum+c[i][j];
				
			}

		}
		System.out.println(sum);
		System.out.println();
		for (int j=0;j<a[0].length;j++)
		{
			System.out.println(c[0][j]);

			
		}

		
	}
}
