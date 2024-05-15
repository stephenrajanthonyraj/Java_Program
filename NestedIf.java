 package JavaPro;

import java.util.Scanner;

public class NestedIf {  
	
	public static void main(String args[]) {
		
		Scanner myData= new Scanner(System.in);
		
		System.out.println("Enter your Trip Plan:");
		String trip=myData.next();
		
		System.out.println("Enter your Age:");
		int age=myData.nextInt();
		
		System.out.println("Enter your Registration Status:(yes/no)");
		String Status=myData.next();
		
		if(age>=18) {
			
			if(Status.equals("yes")) {
				System.out.println("Enter your Membership category :(silver/gold/platinum)");
				String membership=myData.next();
				
				if(membership.equals("silver")) {
					
					int silver=5000;
					
					int discount=(15*silver)/100;
					System.out.println("Enter Total Bill:" + discount);
					int totalbill=myData.nextInt();
				}
					else if(membership.equals("gold")) {
						int gold=7000;
						
						int discount1=(15*gold)/100;
						System.out.println("Enter Total Bill:" + discount1);
						}
				
					else if(membership.equals("plantinum")) {
						int plantinum=9000;
						int discount2=(15*plantinum)/100;
						System.out.println("Enter Total Bill:" + discount2);
					}
					else {
						System.out.println("your not get a membership");
						
						
						}
					}
			
			
			else {
				System.out.println("Your not Register");
			}
	   }
		else {
			System.out.println("You are age not eligble ");
		}
		
	}
}


