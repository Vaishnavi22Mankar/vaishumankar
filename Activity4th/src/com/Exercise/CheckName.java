package com.Exercise;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class CheckName extends Exception{
    void validateName(String name)throws InvalidNameException {
    	String[] names= {"Vaishu","Jyoti","moni","teja"};
    	boolean found=false;
    	for(String n:names) {
    		if(n.equalsIgnoreCase(name)) {
    			found=true;
    			break;
    		}
    	}
    	if(found) {
    		System.out.println("The name is Valid");
    	}
    	else {
    		throw new InvalidNameException("Invalid name,please try again");
    	}
    }
	public static void main(String[] args) {
		
           CheckName ch=new CheckName();
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the Name :");
           String name=sc.next();
           try {
        	   ch.validateName(name);
           }
           catch(InvalidNameException e) {
        	   System.out.println("Invalid name");
           }
	}

}
