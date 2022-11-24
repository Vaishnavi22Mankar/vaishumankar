package com.secActivity;
import java.util.Scanner;

 class Customer{
	 Scanner sc=new Scanner(System.in);
	private String accountName;
	   private String accountNumber;
	   private int accountBalance;
	   
	public void CreateAccount() 
	 {
		 System.out.println("Enter AccountName :");
		 accountName=sc.next();
		 System.out.println("Enter Account Number :");
		 accountNumber=sc.next();
		 System.out.println("Enter Account balance :");
		 accountBalance=sc.nextInt();
	 }  
	 public void setAmount() {
		 int amount;
		 System.out.println("Enter the amount you want to add :");
		 amount=sc.nextInt();
		 accountBalance=(accountBalance+amount);
		 System.out.println("Balance after entering amount is :"+ accountBalance);
	 }
	 public void getAmount() {
		 System.out.println("The Name of account is :"+accountName);
		 System.out.println("The account balance is :"+accountBalance);
	 }
	 public void withDrawAmount() {
		 int withdraw;
		 System.out.println("Enter the amount you want to withdraw");;
		 withdraw=sc.nextInt();
		 accountBalance=(accountBalance-withdraw);
		 System.out.println("The amount after withdraw is :"+accountBalance);
	 }
}
public class CustomerMain {
   public static void main(String[] args) {
	   Customer c=new Customer();
	   c.CreateAccount();
	   c.setAmount();
	   c.getAmount();
	   c.withDrawAmount();
   }
}
