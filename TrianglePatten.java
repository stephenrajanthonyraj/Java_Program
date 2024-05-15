package JavaPro;

import java.util.Scanner;

public class TrianglePatten {
	
	public static void main(String args[]) {
		
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Enter the number of row ");		
		int n=myObj.nextInt();System.out.println("Enter the number of row ");
		
		
		
		
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("&");
//			}
//			System.out.println();
//		}
		
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"");
//			}
//			System.out.println();
//		}
		
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
		
		for (int i=0;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				int a=i+j>n ? i+j-n: i+j;
				System.out.print(a);
			}
			System.out.println();
		}
		
	}

}
