package com.Exp2;

import java.util.HashSet;
import java.util.Iterator;

public class StateMain {
	public static void main(String args[]){  
		State a=new State();
		a.addState("rajpur");			//adding sate name
		a.addState("Karnataka");
		a.addState("pune");
		a.addState("surat");
		
		System.out.println("Retrive the details of state:"+a.retriveState("pune"));
}
	 
}


