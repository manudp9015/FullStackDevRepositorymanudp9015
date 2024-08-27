package com.polymorphism;

abstract class Transportation 
{
    abstract void move();
}

class Car extends Transportation 
{
    void move() 
    {
        System.out.println("car");
    }
}

class Bicycle extends Transportation 
{
    void move() 
    {
        System.out.println("bicycle");
    }
}



public class Maindemo4
{
    public static void main(String[] args) 
    {
        Transportation transportation;

        transportation = new Car();
        transportation.move();

        transportation = new Bicycle();
        transportation.move();

       
    }
}

