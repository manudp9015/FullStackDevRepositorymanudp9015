package com.oopstest;
class demo7
{
	
	static void demo(int age) throws Exception
	{
		try 
		{
		if(age<18) 
		{
			throw new Exception("age must greater than 18 for voting ");
		}
		
		System.out.println("valis age :"+age);
	}
		catch (Exception e) 
		{
		e.printStackTrace();
	}
	}
}
public class Maindemo7
{

	public static void main(String[] args)
	{
		try {
			
			demo7.demo(3);
			demo7.demo(19);

			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
