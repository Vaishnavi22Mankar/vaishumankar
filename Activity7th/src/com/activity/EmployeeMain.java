package com.activity;

import java.util.ArrayList;
import java.util.Collections;



public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"suraj cakhre",44,20000);
		Employee e2=new Employee(2,"sakshi gure",24,10000);
		Employee e3=new Employee(3,"raj solanke",52,30500);
		Employee e4=new Employee(4,"jayshree jagdale",20,34000);
		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		Collections.sort(emp);
		for(Employee e:emp) {
			System.out.println(e.id+" "+e.name+" "+e.age+" "+e.salary);
		}
		
		
	}

}
