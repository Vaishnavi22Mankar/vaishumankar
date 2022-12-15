package com.activity5th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise3rd {

	static int line=0,character=0,words=0;
	static int content=0;
	public static void totalcount(FileInputStream fin) throws IOException{
		while(fin.available()!=0) {
			content=fin.read();
			if(content!=10)
				character++;
			if(content==32)
				words++;
			if(content==13) {
				line++;
				words++;
			}
		}
		fin.close();
	}
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("C:\\javaprg\\Ex1.txt");
			totalcount(fin);
		}
		catch(FileNotFoundException e) {
			System.out.println("FIle not found");
		}
		catch(IOException i) {
			System.out.println("File not able to read");
		}
		System.out.println("Number of character are :"+character);
		System.out.println("Number of word are :"+words);
		System.out.println("Number of lines are :"+line+1);

	}

}
