package com.oopstest;

class demo10 
{
    int add(int a, int b) 
    {
        return a + b;
    }
}

class demo10Child extends demo10 
{
   
    int add(int a, int b) 
    {
        return a + b + 10;  
    }
}

public class Maindemo10 
{
    public static void main(String[] args) 
    {
        demo10 parentObj = new demo10();
        demo10Child childObj = new demo10Child();

        int res1 = parentObj.add(10, 10);
        System.out.println("parent class " + res1);  

        int res2 = childObj.add(10, 10);
        System.out.println("child class " + res2); 
    }
}
