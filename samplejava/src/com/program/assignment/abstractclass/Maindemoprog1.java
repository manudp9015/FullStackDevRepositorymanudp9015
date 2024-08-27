package com.program.assignment.abstractclass;

abstract class Animal
{
	static void sound()
	{
		System.out.println("animals make sound");
		
	}
	static void bark()
	{
		System.out.println("animals bark");

	}
}
 class Dog extends Animal
{
	void bark1() 
	{
		Animal.sound();
		Animal.bark();
		System.out.println("dogs  bark");
	}
}

public class Maindemoprog1 
{
	public static void main(String args[])
	{
		Dog o=new Dog();
		o.bark1();
	}
}
