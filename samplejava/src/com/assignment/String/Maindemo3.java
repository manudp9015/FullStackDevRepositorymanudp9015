package com.assignment.String;

public class Maindemo3
{
	 static void getReplace()
	 {
		 StringBuffer b=new StringBuffer("rohi is a good boy");
		 b.delete(0, 4);                            
		 b.insert(0,"manu");
		 System.out.println(b);
	 }
		public static void main(String[] args) {
			getReplace();

		}

	}