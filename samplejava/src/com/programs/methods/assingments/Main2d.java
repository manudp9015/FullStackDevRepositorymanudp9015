package com.programs.methods.assingments;

class Human1{
	String firstname;
	int age;
	Human1(String firstname,int age)
	{
		this.firstname=firstname;
		this.age=age;
		System.out.println(firstname);
		System.out.println(age);

	}
	void display()
	{
		System.out.println(firstname);
		System.out.println(age);	
	}
}
public class Main2d 
{
		public static void main (String args[])
		{
		Human1 ob1=new Human1("manu",20);
		ob1.display();
		
		}

}
