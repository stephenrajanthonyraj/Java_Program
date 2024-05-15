package JavaPro;

import java.util.Scanner;
public class CurrentBill {
	
	public static void main(String args[]) {
		
		Scanner currentBill= new Scanner(System.in);
		
		System.out.println("Input of Unit");
		double input= currentBill.nextDouble();
		
		System.out.println("One Unit cost");
		double cost= currentBill.nextDouble();
		
		double total = input*cost;
		System.out.println("Total Bill Amount:" +total);
		
		if(total >=200) {
			
			System.out.println("Your pay the Bill");
			
		}
		else {
			System.out.println("Your not pay the Bill");
		}
		
		
	}

}
