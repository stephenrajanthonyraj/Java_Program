package JavaPro;

import java.util.Scanner;

public class LeftTriangle {
	
	public static void main(String args[]) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the number of row ");
		
		int n=myObj.nextInt();
		
		for (int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("&");
			}
			System.out.println();
		}
	}

}
