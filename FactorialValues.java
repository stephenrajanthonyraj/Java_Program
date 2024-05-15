package JavaPro;

import java.util.Scanner;

public class FactorialValues {
	
	public static void main(String args[]) {
		
		Scanner myObj=new Scanner(System.in);

		int num=1;
		
		System.out.println("Enter the number: ");
		int fact=myObj.nextInt();
		
	   for(int i=1;i<=fact;i++) {
		   
		   num*=i;
	   }
	   System.out.println("Factorial value is " + num);
	}

}
