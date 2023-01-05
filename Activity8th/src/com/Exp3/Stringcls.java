package com.Exp3;

public class Stringcls {

	public static void main(java.lang.String[] args) {
	   String name="MBAchaivala";
	   String s5="flag"; 
	   char ch=name.charAt(4); //returns the char value at the 4th index  
	   System.out.println(""+ch); 
	   name.concat("is one of the best"); 
	   System.out.println("After concat :"+name);
	   int index=name.indexOf('a');
	   System.out.println("Index of a is :"+index);
	   System.out.println("after capmaring :"+name.compareTo(s5));
	   String replaceString=name.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
	   System.out.println("after replace :"+replaceString); 
	   System.out.println("after substring :"+name.substring(2,4));
	   String s1lower=name.toLowerCase();  
	   System.out.println("lower case:"+s1lower);  
	   
	   
	   
	   

	}

}
