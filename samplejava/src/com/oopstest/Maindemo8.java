package com.oopstest;

class demo8
{ 
	private String name;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Maindemo8
{
    public static void main(String[] args) 
    {
        demo8 o = new demo8();

        o.setName("manu");
        String name= o.getName();

        System.out.println("Name: " +name);
    }
}
