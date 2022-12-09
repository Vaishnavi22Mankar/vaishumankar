package com.Exercise;

import java.util.Scanner;



public class Exercise1st {

	public static void main(String[] args)throws Exception{
		int a,b,c;
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st value");
		a=sc.nextInt();
		System.out.println("Enter 2nd value");
		b=sc.nextInt();
		
		
		if(a==0 && b==0) {
			throw new Exception("Enter two number");
		}
		else {
			try {
				c=a/b;
				System.out.println("Result is :"+c);
			}
			catch(ArithmeticException e) {
				System.out.println("performing divide by zero");
			}
			
		}
		
		 
	}

}
