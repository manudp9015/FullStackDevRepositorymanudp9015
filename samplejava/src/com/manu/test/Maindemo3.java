package com.manu.test;

class Demo1 {
    int instanceVar1 = 10;
    int instanceVar2 = 20;
    static int staticVar1 = 30;
    static int staticVar2 = 40;

    void displayInstanceVars()
    {
        System.out.println( instanceVar1);
        System.out.println( instanceVar2);
    }

    static void displayStaticVars() 
    {
        System.out.println( staticVar1);
        System.out.println(staticVar2);
    }
}

class Demo2 
{
    Demo2() 
    {
        System.out.println("Constructor block");
       Demo1.displayStaticVars();
       Demo1 o=new Demo1();
       o.displayInstanceVars() ; 
    }
}

public class Maindemo3 {
    public static void main(String[] args) {
        Demo2 o2= new Demo2();
    }
}
