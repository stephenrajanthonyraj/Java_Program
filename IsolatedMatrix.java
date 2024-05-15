package JavaPro;

import java.util.Scanner;

public class IsolatedMatrix {
	
	public static void main(String args[]) {
		
		
		
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Enter the number of row ");		
		int n1=myObj.nextInt();
	    
	    
		
		System.out.println("Enter the number of col ");		
		int n2=myObj.nextInt();
		
		
		
		 
		for (int i=1;i<=n1;i++) {
			for(int j=1;j<=n2;j++) {
				if (i == 1 || i == n1 || j == 1 || j == n2) {
					
					
					
					System.out.print(i+""+j);
				}
				
			}
			System.out.println();
		}
		
	}

}
