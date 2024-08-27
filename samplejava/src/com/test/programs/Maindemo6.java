package com.test.programs;

class Logicaland
{
    static boolean logicalAnd(boolean a, boolean b) 
    {
        return a && b;
    }
}

public class Maindemo6 
{
    public static void main(String[] args) 
    {
        boolean result = Logicaland.logicalAnd(true,true);
        System.out.println( result);
    }
}
