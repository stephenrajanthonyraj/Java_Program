package JavaPro;

import java.util.Scanner;

public class MoodleTask1 {
	
	public static void main(String args[]) {
		
		Scanner myData=new Scanner(System.in);
		
		System.out.println("Enter the Year :");
		
		int n=myData.nextInt();
		
		if (n%4==0) {
			
			System.out.println("This year is Leap Year");
			
			
		}
		else {
			System.out.println("This year is not Leap Year");
		}
		
	}

}
