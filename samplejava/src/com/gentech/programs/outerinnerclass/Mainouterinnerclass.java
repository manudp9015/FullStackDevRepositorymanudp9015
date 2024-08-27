package com.gentech.programs.outerinnerclass;

class Bank
{
	private int accountno;
	private String accountholdername;
	public int getAccountno()
	{
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	
	
	
}
public class Mainouterinnerclass 
{
	public static void main(String args[])
	{
		Bank obj1=new Bank();
		obj1.setAccountno(100000);
		obj1.setAccountholdername("manu");
		
		int accno=obj1.getAccountno();
		String accname=obj1.getAccountholdername();
		System.out.println(accno);
		System.out.println(accname);

		

		
		

		
	}
}
