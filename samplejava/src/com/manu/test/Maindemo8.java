package com.manu.test;

class demo8 
{
    void add(int a,int b)
    {
    	int c=a+b;
        System.out.println(c);
        System.out.println("+++++++++++++++++++++++++++");

    }

    {
        System.out.println("instatce bolck");

    	add(1,3);
    }
}



public class Maindemo8
{
    public static void main(String[] args) 
    {
        demo8 o1 = new demo8();
    }
}
