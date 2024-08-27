package com.oopstest;

class Outer
{
    Inner innerobj1 = new Inner();

    class Inner
    {
        int age;
        String name;
    }
}

public class Maindemo5 
{
    public static void main(String[] args)
    {
        Outer outerobj1 = new Outer();
        int age= outerobj1.innerobj1.age = 20;
        String name=  outerobj1.innerobj1.name = "manu";
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}
