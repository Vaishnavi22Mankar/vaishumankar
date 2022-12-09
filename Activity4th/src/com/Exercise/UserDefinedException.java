package com.Exercise;


import java.util.Scanner;

class InvalidAgeWeightException extends Throwable {
	public InvalidAgeWeightException() {
		super();
	}
}


public class UserDefinedException {
	
	float weight;
	int age;
	public UserDefinedException(float weight,int age) {
		this.weight=weight;
		this.age=age;
		try {
			if(age<18 || weight<50) {
				throw new InvalidAgeWeightException();
			}
		}
		catch(InvalidAgeWeightException i) {
			System.out.println(i);
		}
	}
	void display() {
		System.out.println("Weight of the person is :"+weight);
		System.out.println("Age of the person is :"+age);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
			 System.out.print("Enter the persont weight :");
			 float weight=sc.nextInt();
			 System.out.println("Enter the person age :");
			 int age=sc.nextInt();
			 
			 UserDefinedException c=new  UserDefinedException(weight,age);
			 c.display();
	}

}
