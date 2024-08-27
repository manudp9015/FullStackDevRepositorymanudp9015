package com.gentech.programs.outerinnerclass;



class Outer3
{
	void meth() 
	{
		
		Inner3a innerobj3a1=new Inner3a();
		Inner3b innerobj3b1=new Inner3b();
		innerobj3a1.setAge(22);
		innerobj3a1.setName("manu");
		
		int age3a=innerobj3a1.getAge();
		String name3a=innerobj3a1.getName();
		
		System.out.println(age3a);
		System.out.println(name3a);
		
		
		innerobj3b1.setAge(20);
		innerobj3b1.setName("rohith");
		
		int age3b=innerobj3b1.getAge();
		String name3b=innerobj3b1.getName();
		
		System.out.println(age3b);
		System.out.println(name3b);
	}
	
	
	private class Inner3a
	{		private int age;
			private String name;
			
			public int getAge()
			{
				return age;
			}
			public void setAge(int age)
			{
				this.age = age;
			}
			public String getName() 
			{
				return name;
			}
			public void setName(String name)
			{
				this.name = name;
			}
	}
	private class Inner3b
	{		private int age;
			private String name;
			
			public int getAge()
			{
				return age;
			}
			public void setAge(int age)
			{
				this.age = age;
			}
			public String getName() 
			{
				return name;
			}
			public void setName(String name)
			{
				this.name = name;
			}
				
		
	}
}

public class Mainouterinnerclas3
{
	public static void main (String args[])
	{
		Outer3 outerobj1=new Outer3();
		outerobj1.meth();
		
		
	}
}
