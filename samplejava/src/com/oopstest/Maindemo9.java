package com.oopstest;


abstract class Animal 
{
    abstract void makeSound();
}

class Dog extends Animal 
{
    void makeSound() 
    {
        System.out.println("Baow");
    }
}

class Cat extends Animal 
{
    void makeSound() 
    {
        System.out.println("Meow");
    }
}

class Cow extends Animal 
{
    void makeSound() 
    {
        System.out.println("Ambaaa");
    }
}

public class Maindemo9
{
    public static void main(String[] args) 
    {
        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Cow();
        animal.makeSound();
    }
}
