
package com.secActivity;
import java.io.*;
import java.util.Scanner;

class Arithmetic{
Scanner sc=new Scanner(System.in);
	 int add(int a,int b) {
		int sum=a+b;
		return sum;
		
	}
}
class Adder extends Arithmetic{
	
	public int sum(int a,int b) {
		return sum(a,b);
	}
}



public class Exercise2 {

	 public static void main(String[] args) {
		 Adder a=new Adder();
		 System.out.println("My superclass  is :"+a.getClass().getName());
		 System.out.println(a.add(55, 33)+" "+a.add(99, 40)+" "+a.add(75, 38));
	 }
}
