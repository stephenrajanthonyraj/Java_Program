package JavaPro;

import java.util.Scanner;

public class NestedForLoop {
	
	public static void main(String args[]) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the number of row ");
		
		int n=myObj.nextInt();
		
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("&");
				
			}
			System.out.println();
		}
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.println("Row :"+ i  +", Column :" + j);
//			}
//		}
		
	}

}
