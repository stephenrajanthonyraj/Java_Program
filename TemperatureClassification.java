package JavaPro;

import java.util.Scanner;

public class TemperatureClassification {
	
	public static void main(String args[]) {
		
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Enter your area Temperature in Celsius :");
		int temp=myObj.nextInt();
		
		if(temp<=20 && temp<30) {
			System.out.println("This Celsius is warning about  Ice Condition.");		
		}
		else if(temp>=31){
			System.out.println("This Celsius is warning about  Heat Advisory.");
		}
		else {
			System.out.println("This Celsius is Normal.");
		}
	
	
		
		
		
	}

}
