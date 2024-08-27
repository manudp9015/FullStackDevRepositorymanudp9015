package com.test.programs;

class Rectangle
{
    static double area(double length, double width)
    {
        return length * width;
    }
}

public class Maindemo4
{
    public static void main(String[] args) 
    {
       
        double area = Rectangle.area(5,3);
        System.out.println( + area);
    }
}
