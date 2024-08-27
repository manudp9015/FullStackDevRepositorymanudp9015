package com.manu.test;

class demo71 
{
    static {
        System.out.println("static block1");
    }

    {
        System.out.println("instance block");
    }
}

class demo72 {
    demo72(String name) 
    {
        demo71 o = new demo71();
        System.out.println(name);
    }
}

public class Maindemo7 
{
    public static void main(String[] args) 
    {
        demo72 o1 = new demo72("parametrized constructor "+"manu");
    }
}
