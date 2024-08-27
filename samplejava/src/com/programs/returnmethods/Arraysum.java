package com.programs.returnmethods;

class ArraySum1 
{
    int Array1d(int a[])
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) 
        {
            sum += a[i];
        }
        return sum;
    }
}

public class Arraysum 
{
    public static void main(String[] args) 
    {
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80};
        ArraySum1 o1 = new ArraySum1();
        int res = o1.Array1d(a);
        System.out.println("Sum of array elements: " + res);
    }
}
