package com.activity;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExp {

	public static void main(String[] args) {
		
		TreeSet<String> color=new TreeSet<>();
		color.add("black");
		color.add("blue");
		color.add("pink");
		color.add("white");
		
		System.out.println(color);
		
		TreeSet<String> color2=new TreeSet<>();
		color2.addAll(color); //copying the element from 1st tree set to 2nd tree set
		System.out.println("______________________________________________");
		System.out.print("after comaring tree set :");
		System.out.println(color.equals(color2));//comparing the 1st tree set second tree set
		System.out.println("______________________________________________");
		System.out.println("Reverse order :");
		Iterator itr=color2.descendingIterator(); //reversing the elements in the tree set
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("______________________________________________");
		System.out.println("first key is :"+color2.first()); //getting first element from the tree set
		System.out.println("last key is :"+color.last());   //getting last element from the tree set
		 
	}
}
