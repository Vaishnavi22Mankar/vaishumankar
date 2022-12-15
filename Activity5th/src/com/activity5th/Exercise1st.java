package com.activity5th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1st {

	static void readwrite()throws IOException{
		System.out.println("Enter choice 1 for write & 2 for read");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1) {
			FileOutputStream fout=new FileOutputStream("C:\\javaprg\\Ex1.txt");
			String s="Welcome to my channel";
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();
		}
		else if(a==2){
			FileInputStream fin=new FileInputStream ("C:\\javaprg\\Ex1.txt");
			while((a=fin.read())!=-1) {
				System.out.println((char)a);
			}
			fin.close();
		}
		else {
			System.out.println("please enter a valid input");
		}
		System.out.println("\n Successfully done");
	}
	public static void main(String[] args) {
		try {
			readwrite();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
