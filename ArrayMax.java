package JavaPro;

import java.util.Scanner;

public class ArrayMax {
	public static void main(String args[]) {
		
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		
		int size=myObj.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the Array element:");
		
		for(int i=0;i<size;i++) {
			a[i]=myObj.nextInt();
			
		}
		
		int max=a[0];
		
		System.out.println("Maximum array value is:");
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				System.out.print(max);
			}
			System.out.println();
		}
		
		int min=a[0];
		
		System.out.println("Minimum array value is:");
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				System.out.print(min);
			}
			System.out.println();
		}
		
        int mid=a.length/2;
		
		System.out.println("Middle array value is:");
		for(int i=0;i<a.length/2;i++) {
			if(mid%a[i] !=0) {
				mid=a[i]/2;
//				System.out.print(mid);
			}
			System.out.println(mid);
		}
		
		
	}
	

}
