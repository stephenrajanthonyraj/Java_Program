package JavaPro;

import java.util.Scanner;

public class EquilateralTriangle {
	
	   public static void main(String args[]) {
		   
		   Scanner myObj=new Scanner(System.in);
			System.out.println("Enter the number of row ");
			
			int n=myObj.nextInt();
	        int spaces = n - 1;

	        for (int i = 1; i <=n; i++) {
	            for (int j = 1; j <= spaces;j++) {
	                System.out.print(" ");
            }
            spaces--;

	            for (int j = 1; j <= 2 * i - 1; ++j) {
	                System.out.print(j+"");
	            }
            System.out.println();
	        }
	        
	       
	   }


}
