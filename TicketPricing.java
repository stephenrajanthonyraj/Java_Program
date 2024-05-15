package JavaPro;

import java.util.Scanner;

public class TicketPricing {
	
	public static void main(String args[]) {
		
		Scanner myData= new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age=myData.nextInt();
		
		if(age<=12) {
			
			int ticket=280;
			int discount=(5*ticket)/100;
			ticket=ticket-discount;
			System.out.println("Your Ticket price is :"+ticket);
		}
		else if(age>=60) {
			
			int ticket=280;
			int discount=(10*ticket)/100;
			ticket=ticket-discount;
			System.out.println("Your Ticket price is :"+ticket);
			
		}
		
		else {
			
			int ticket=280;
			System.out.println("Your Ticket price is :"+ ticket);
		}
	}

}
