package com.Exp3;

public class StringBuild {

	public static void main(String[] args) {
		StringBuilder sbr=new StringBuilder("carcolllection ");  
		sbr.append("suzuki"); 
		System.out.println("After concat :"+sbr);
		   
		System.out.println("after substring :"+sbr.substring(6));
		 
		System.out.println("length is :"+sbr.length());
		

	}

}
