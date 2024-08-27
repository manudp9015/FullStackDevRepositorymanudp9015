package com.polymorphism;

abstract class Employee 
{
    abstract void work();
}

class Engineer extends Employee 
{
    void work() 
    {
        System.out.println("Engineer developer");
    }
}

class Manager extends Employee 
{
    void work() 
    {
        System.out.println("Managing the company");
    }
}

class Intern extends Employee 
{
    void work() 
    {
        System.out.println("Intern help a team");
    }
}

public class Maindemo3 
{
    public static void main(String[] args) 
    {
        Employee employee;

        employee = new Engineer();
        employee.work();

        employee = new Manager();
        employee.work();

        employee = new Intern();
        employee.work();
    }
}

