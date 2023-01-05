package com.Exp3;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sbr=new StringBuffer("CodeWithHarry"); 
		sbr.append("python");//now original string is changed  
		System.out.println("After append :"+sbr);
		sbr.insert(1,"Javascript");//now original string is changed  
		System.out.println("After insert :"+sbr);
		sbr.replace(1,3,"py");  
		System.out.println("after replace :"+sbr);
		sbr.reverse();  
		System.out.println("after reverse :"+sbr);
		

	}

}
