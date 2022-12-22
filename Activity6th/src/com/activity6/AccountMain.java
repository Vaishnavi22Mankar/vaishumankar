package com.activity6;

public class AccountMain {

	public static void main(String[] args) {
		Account a=new Account();		
		a.deposite();			
		try
		{
			
			a.withdraw();		
			
		}
		catch(Exception e)		
		{
			System.out.println(e);
		}
		 

	}

}
