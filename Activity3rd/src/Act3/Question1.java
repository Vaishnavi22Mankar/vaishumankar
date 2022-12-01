package Act3;

import java.util.Scanner;

class ReverseNum{
	public void reverno() {
		int reverse=0;
		System.out.println("Enter the number to reverse :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num!=0) 
		{
			int reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
		System.out.println("the reverse of the given no is :"+reverse);
	}
	
}
class SumOfDigits extends ReverseNum{
	public void Sum(){
		int sum=0,digit;
		System.out.println("Enter the number to find sum of digits :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum of digit is :"+sum);
	}
}
class DisOut extends SumOfDigits{
	
}
public class Question1 {

	public static void main(String[] args) {
		
		SumOfDigits s=new SumOfDigits();
		s.reverno();
		s.Sum();
	}

}
