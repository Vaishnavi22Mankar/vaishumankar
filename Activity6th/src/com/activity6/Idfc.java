package com.activity6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Idfc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password:");		
		String password=sc.next();
		String regex="[A-Za-z#@*]{8}";	
		Pattern p=Pattern.compile(regex);	
		Matcher m=p.matcher(password);		
		boolean matchFound=m.find();	
		if(matchFound)
		{
			System.out.println("password is valid");
		}
		else {
			System.out.println("Invalid password....please try again");
		}

	}

}
