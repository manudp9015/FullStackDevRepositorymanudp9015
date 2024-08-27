package com.oopstest;

interface demo6
{
	void parent();
	
}
interface demo6child extends demo6
{
    void child();
	
}
	
class demo6grandchild implements demo6child
{
	public void parent() 
	{
		System.out.println("parent interface");
	}
	
	public void child() 
	{
		System.out.println("child  interface");
	}
	
}


public class Maindemo6
{
	public static void main(String args[])
	{
		demo6grandchild o=new demo6grandchild();
		o.child();
		o.parent();
	}
}
