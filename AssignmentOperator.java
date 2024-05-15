package JavaPro;

import java.util.Scanner;

public class AssignmentOperator {
	
	public static void main(String args[]) {
		
//		int x=400;
//		int y=200;
//	    x+=50;
//	    y+=350;
//	    
//	    
//		
//		System.out.println(x);
//		System.out.println(y);
//		
//		
//		x*=4;
//		y*=3;
//		System.out.println(x);
//		System.out.println(y);
//		
//		x/=2;
//		y/=2;
//		
//		System.out.println(x);
//		System.out.println(y);
		
//		int a=20;
//		 System.out.println(a+=30);
//		 
//		 System.out.println(a-=30);
//		 System.out.println(a*=30);
//		 System.out.println(a/=30);
//		 System.out.println(a%=30);
//		 System.out.println(a++);
//		 System.out.println(++a);
		
		
		
		Scanner assignData = new Scanner(System.in);
		
		System.out.println("a=");
		
		int a=assignData.nextInt();
		
		System.out.println("b=");
		
		int b=assignData.nextInt();
		
		System.out.println("a=" + (a+=20));
		
		int c=assignData.nextInt();
		
		System.out.println("b=" + (b+=20));
		
		int d=assignData.nextInt();
		
		System.out.println("a=" + (a-=20));
		
		int e=assignData.nextInt();
		
		System.out.println("b=" + (b-=20));
		
		int f=assignData.nextInt();
		
		System.out.println("a=" + (a*=20));
		
		int g=assignData.nextInt();
		System.out.println("b=" + (b*=20));
		
		int h=assignData.nextInt();
		
		System.out.println("a=" + (a/=20));
		
		int i=assignData.nextInt();
		
		System.out.println("a=" + (b/=20));
		
		int j=assignData.nextInt();
		
		System.out.println("a=" + (a%=20));
		
		int k=assignData.nextInt();
		
		System.out.println("a=" + (b%=20));
		
		int l=assignData.nextInt();
		
	}

}
