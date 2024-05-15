package JavaPro;

import java.util.Scanner;

public class UserInput {
	
	public static  void main(String args[]) {
		
		Scanner arrayData = new Scanner(System.in);
		
		System.out.println("Bio-Data");
		
		System.out.println("Name :");
		
		String name= arrayData.next();
		
		System.out.println("Age :");
		
		int age= arrayData.nextInt();
		
        System.out.println("Qualification :");
		
   		String qualification = arrayData.next();
 		
		System.out.println("AddharNumber : ");
		
		long addharNumber= arrayData.nextLong();

System.out.println("PhoneNumber");
		
		long PhoneNumber=  arrayData.nextLong();
		
		
		
		
		
	}

}
