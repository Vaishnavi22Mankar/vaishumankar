package com.activity;


import java.util.Map;
import java.util.TreeMap;

public class TreemapExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TreeMap<Integer,Integer> ex=new TreeMap<Integer,Integer>(); 
		 for(int i=1;i<=20;i++) {
			 ex.put(i,i*i);
		 }
		 for(Map.Entry e:ex.entrySet()) {
			 System.out.println(e.getKey()+" Square is :"+e.getValue());  
			
		 }
		 TreeMap<Integer,Integer> ex2=new TreeMap<Integer,Integer>();
		 ex2.putAll(ex);
		  
		 System.out.println("To  search for a specific key :"+ex2.containsKey(7));			//searching a key in a treeMap
		 System.out.println("To search a specific value in key: "+ex2.containsValue(9));	 //searching a key in a treeMap
		
		 System.out.println("_______________________________________________");  //to get a greatest key
		 System.out.println("greates key is :"+ex2.higherKey(19));
		 
		 System.out.println("_______________________________________________");//to get and remove least key
		System.out.println(ex2.pollFirstEntry());
	
		 System.out.println("_______________________________________________");// to get and remove least key
		System.out.println(ex2.pollLastEntry());
		 }
	}
	


