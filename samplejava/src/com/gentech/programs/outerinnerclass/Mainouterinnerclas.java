package com.gentech.programs.outerinnerclass;

class Outer
{
	Inner innerobj1=new Inner();
	
	class Inner
	{
			private int age;
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

public class Mainouterinnerclas 
{
	public static void main (String args[])
	{
		Outer outerobj1=new Outer();
		outerobj1.innerobj1.setAge(20);
		outerobj1.innerobj1.setName("manu");
		
		int age=outerobj1.innerobj1.getAge();
		String name=outerobj1.innerobj1.getName();
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
		
	}
}
