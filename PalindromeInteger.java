package JavaPro;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String args[]) {
		
		
		int num,reversenum=0, remain, x ;
		
		Scanner myData= new Scanner(System.in);
		
		System.out.println("Enter your Number :");
		int y=myData.nextInt();
		
//		System.out.println("Enter any Word :");
//		String z=myData.next();
		
		x = y;
		
		
		while(y!=0) {
			
			remain = y % 10;
            reversenum = reversenum * 10 + remain;
            y /= 10;			
		}
		
		if(x==reversenum) {
			
			System.out.println("This Number is Palindrome");
		}
		else {
			
			System.out.println("This Number is not Palindrome");
		}
		
	}

}
