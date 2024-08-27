package com.test.programs;

class Circle 
{
    static double area(double radius) {
        return 3.142 * radius * radius;
    }
}

public class Maindemo3
{
    public static void main(String[] args) 
    {
      
        double area = Circle.area(5);
        System.out.println( + area);
    }
}
