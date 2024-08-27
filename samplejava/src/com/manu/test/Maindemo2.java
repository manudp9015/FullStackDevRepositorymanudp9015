package com.manu.test;
class School
{
	String name;
	int age;
	void getName()
	{
		this.name="manu";
		System.out.println("Name of Student"+this.name);
	}
	void getAge()
	{
		this.age=22;
		System.out.println("age :"+this.age);
	}
	
}
class Library 
{
	Library()
	{
		School o1=new School();
		o1.getAge();
		o1.getName();
		
	}
}
public class Maindemo2{

	public static void main(String[] args) {
		Library o1=new Library();
	}

}