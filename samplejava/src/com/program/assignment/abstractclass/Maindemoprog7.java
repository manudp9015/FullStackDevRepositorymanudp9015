package com.program.assignment.abstractclass;

abstract class Emp7
{
	
    Emp7(String empname)
    {
        System.out.println("Employee name:"+empname);

    }
    Emp7(int id)
    {
        System.out.println("Employee id:"+id);

    }
}

abstract class Man7 extends Emp7
{

	Man7(int id) 
	{
		super(id);
	}

	Man7(String empname) 
	{
		super(empname);
	}
    
    
}

class Dir7 extends Man7 
{

	Dir7(int id) 
	{
		super(id);
	}
	Dir7(String empname) 
	{
		super(empname);
	}
  
}

public class Maindemoprog7
{
    public static void main(String[] args) {
        Dir7 o = new Dir7(20);
        Dir7 o1 = new Dir7("manu");
        
             
                   
    }
}
