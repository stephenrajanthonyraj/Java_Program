package JavaPro;

import java.util.Scanner;

public class MatrixAddition {
	
	public static void main(String args[]) {
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		int i,j;
		
		Scanner myData=new Scanner(System.in);
		
		System.out.println("Enter the first matrix Value:");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				a[i][j]=myData.nextInt();
			}
		}
		
		System.out.println("Enter the Second matrix Value:");
		for(i=0;i<b.length;i++) {
			for(j=0;j<b[i].length;j++) {
				b[i][j]=myData.nextInt();
			}
		}
		
		System.out.println("the matrix Addition Value is:");
		for(i=0;i<c.length;i++) {
			for(j=0;j<c[i].length;j++) { 
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j] + "    ");
			}
			System.out.println();
		}
		
		System.out.println("the matrix Subtraction Value is:");
		for(i=0;i<c.length;i++) {
			for(j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("the matrix Multiplication Value is:");
		for(i=0;i<c.length;i++) {
			for(j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j] + "    ");
			}
			System.out.println();
		}
		
		System.out.println("the matrix divide Value is:");
		for(i=0;i<c.length;i++) {
			for(j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]/b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
