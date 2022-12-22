package com.activity6;

import java.util.Scanner;

class InSufficientBalancedException extends Exception		//making a userdefined exception
{

	public InSufficientBalancedException(String string)
	
	{
		//creating a constructor
	}	
}

public class Account {

	float balance=0;
	float totalbalance=0;
	float amount;
	
	Scanner sc=new Scanner(System.in);
	
	public void deposite()
	{
		System.out.println("enter the available balace :");	
		balance=sc.nextFloat();
		System.out.println("deposite money");
		amount=sc.nextFloat();			
		totalbalance=balance+amount;
		System.out.println("Total balance is"+totalbalance);		 
	}
	
	public void withdraw() throws InSufficientBalancedException 
	{
		float withdraw;
		System.out.println("enter the amount to be withdraw");
		withdraw=sc.nextFloat();			
		if(totalbalance<withdraw)			
		{
			
			throw new InSufficientBalancedException("NO sufficient fund to withdraw");
		}
		else {
			
			System.out.println("please take money");
		}
			
	}

}
