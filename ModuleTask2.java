package JavaPro;

import java.util.Scanner;

public class ModuleTask2 {
	
	public static void main(String args[]) {
				
		Scanner myData=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=myData.nextInt();
		System.out.println("Enter y value");
		int y=myData.nextInt();
		x=x+y;
		y=x-y;
		
		x=x-y;
	
		
		System.out.println("After Swaping number a is "+x +" b is " + y);
		
		//multiplication and divide
		
		
		if(x==0||y==0) {
			x=0;
			y=0;
			System.out.println("After Swaping number a is "+ x +" b is " + y);
		}
		else {
			x=x*y;
			y=x/y;
			x=x/y;
			
			System.out.println("After Swaping number x is "+x +" y is " + y);
		}
	}

}
