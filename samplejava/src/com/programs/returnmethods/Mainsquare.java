package com.programs.returnmethods;
class Arraysquare 
{
    int[] square(int a[])
    {
    	int n=a.length;
        int []square1= new int[n];
        for (int i = 0; i < a.length; i++) 
        {
          square1[i]=a[i]*a[i];
        }
        return square1;
    }
}
public class Mainsquare 
{
	public static void main(String args[])
	{
		int  a[]= {1,2,3,4,5,6,7,8,9,10};
		Arraysquare o1=new Arraysquare();
		int res[]=o1.square(a);
		for (int i=0;i<=res.length-1;i++)
		{
			System.out.println(res[i]+" ");
		}
	}
		
	
}
