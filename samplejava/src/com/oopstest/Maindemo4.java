package com.oopstest;

class demo4
{
    int a = 10;
}

class Maindemo4 
{
    static void add(demo4 o) 
    {
        int val1=o.a +=10;
        System.out.println(val1);

    }

    public static void main(String[] args) 
    {
        demo4 o1 = new demo4();
        int val2=o1.a = 20;

        add(o1);
        
        System.out.println(val2);
    }
}
