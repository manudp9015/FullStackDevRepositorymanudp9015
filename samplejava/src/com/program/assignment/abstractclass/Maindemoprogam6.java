package com.program.assignment.abstractclass;

abstract class Emp 
{
    abstract void meth(String manname);
    abstract void meth(String dirfirstname, String dirsecondname); 
}

abstract class Man extends Emp 
{
    String manname = "rohith";

    void meth(String manname) 
    {
        System.out.println("manager name: " + manname);
    }

    void meth(String dirfirstname, String dirsecondname) 
    {
        System.out.println("director first name: " + dirfirstname);
        System.out.println("director second name: " + dirsecondname);
    }
}

class Dir extends Man 
{
  
}

public class Maindemoprogam6 {
    public static void main(String[] args) {
        Dir o = new Dir();
        o.meth("John", "Doe");  
        o.meth("manu");       
                   
    }
}
