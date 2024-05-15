package JavaPro;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String args[]) {
		
		Scanner ifData = new Scanner(System.in);
		
		System.out.println("Enter your Weight");
		
		double weight = ifData.nextDouble();
		
		if(weight>=50){
			  
			  System.out.println("Your Eiligbe for blood donation");
		}
		else {
			System.out.println("Your not Eiligbe for blood donation");
		}
		}

}
