package com.test.programs;

class NumberProvider 
{
    void printOddNumbers() 
    {
        for (int i = 21; i >= 11; i= i-2) 
        {
            System.out.print(i + " ");
        }
    }
}

public class Maindemo9 
{
    public static void main(String[] args) 
    {
        NumberProvider provider = new NumberProvider();
        provider.printOddNumbers();
    }
}
