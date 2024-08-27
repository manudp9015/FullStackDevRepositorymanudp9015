package com.manu.test;

class demo10
{
    static void add(int a,int b)
    {
    	int c=a+b;
        System.out.println(c);
        System.out.println("+++++++++++++++++++++++++++");
        
    }
    void sub(int a,int b)
    {
    	int c=a-b;
        System.out.println(c);

    }

    demo10()
    {
    	add(1,2);
    	demo9 o=new demo9();
    	o.sub(2, 1);

    	
    }
}



public class Maindemo10
{
    public static void main(String[] args) 
    {
        demo10 o1 = new demo10();
    }
}
