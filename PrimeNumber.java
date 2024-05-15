package JavaPro;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]) {
		
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n= myObj.nextInt();
		if(n==1) 
			System.out.println("This number is not a prime number");		 
		else if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0 || n==2 || n==3 || n==5 || n==7) {
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
		
	}

}
