package com.activity5th;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2nd {
    
	public String longestword()throws FileNotFoundException{
		String longword=" ";
		String currentword;
		Scanner sc=new Scanner(new File("C:\\javaprg\\Ex1.txt\\"));
		while(sc.hasNext()) {
			currentword=sc.next();
			if(currentword.length()>longword.length()) {
				longword=currentword;
			}
		}
		System.out.println("\n longest word in the file is "+longword);
		return longword;
	}
	
	public static void main(String[] args)throws FileNotFoundException {
		new Exercise2nd().longestword();

	}

}
