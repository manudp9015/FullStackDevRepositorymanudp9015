package com.gentech.programs.outerinnerclass;



class Outer4
{	
	static int age;
	static String name;
	Inner4a innerobj4a1=new Inner4a();
	Inner4b innerobj4b1=new Inner4b();
	
	static class Inner4a
	{		
			static void meth1()
			{
				age=22;
				name="manu";
				System.out.println(age);
				System.out.println(name);
				
			}
	}
	static class Inner4b
		{		
			
			static void meth2()
			{
				age=20;
				name="rohith";
				System.out.println(age);
				System.out.println(name);
			
			}
		
	 }
}

public class Mainouterinnerclas4
{
	public static void main (String args[])
	{		
		Outer4 outerobj1=new Outer4();
		outerobj1.innerobj4a1.meth1();
		outerobj1.innerobj4b1.meth2();

		
	}
}
