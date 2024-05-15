package JavaPro;

import java.util.Scanner;

public class OperatorExample {
	
	public static void main(String args[]) {
		
//	       int a=20;
//	       int b=30;
//	       int c=a+b;
//	       int d=a-b;
//	       int e=a*b;
//	       int f= e/a;
//	       int g=f%b;
//	       System.out.println("a =" +a);
//	       System.out.println("b ="+b);
//	       System.out.println("c =" +c);
//	       System.out.println("d =" +d);
//	       System.out.println("e =" +e);
//	       System.out.println("f =" +f);
//	       System.out.println("g =" +g);
	       
		Scanner myData = new Scanner(System.in);
		
		System.out.println("a=");
		
		int a=myData.nextInt();
		
		
		System.out.println("b=");
		
		int b=myData.nextInt();
		
		System.out.println("c" + (a+b));
		
		int c=myData.nextInt();
		
		System.out.println("d" + (a-b));
		
		int d=myData.nextInt();
		System.out.println("e"+ (a*b));
		
		int e=myData.nextInt();
		System.out.println("f"+ (a/b));
		
		int f=myData.nextInt();
		System.out.println("g"+ (a%b));
		
		int g=myData.nextInt();
		
		
	       
	       
	}

}
