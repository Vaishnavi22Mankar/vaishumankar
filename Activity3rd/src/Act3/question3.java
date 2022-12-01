package Act3;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="Code With Harry";
        System.out.println(s);
        System.out.println("Enter the String :");
        String s2=sc.nextLine();
        System.out.println("After removing the duplicate char :");
        for(int i=0;i<s.length();i++) {
        	boolean b=false;
        	for(int j=0;j<s2.length();j++) {
        		if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s2.charAt(j))) {
        			b=true;
        			break;
        		}
        	}
        	if(b==false) {
        		System.out.println(s.charAt(i));
        	}
        }
	}

}
