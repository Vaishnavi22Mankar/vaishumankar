package com.secActivity;
import java.util.Scanner;
public class Exercise1st {
  public static void main(String[] args) {
	  int k,n;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of rows :");
	  k=sc.nextInt();
	  System.out.println("Enter the number of column :");
	  n=sc.nextInt();
	  int arr[][]=new int[10][10];
	  
	  System.out.println("Enter the element of the matrix :");
	  for (int i=0;i<k;i++) {
		  for (int j=0;j<n;j++) {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println("");
	  }
	  
	  System.out.println("After transposing the element are..");
	  for(int i=0;i<k;i++) {
		  for(int j=0;j<n;j++) {
			  System.out.print(arr[j][i]);
		  }
		  System.out.println("");
	  }
  }
}
