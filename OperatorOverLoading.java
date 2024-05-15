package JavaPro;



public class OperatorOverLoading {
	
	static int Calculator (int a,int b,int c) {
		return a+b+c;
	}
	
	static double Calculator (double a,double b ,double c) {
		return a-b-c;
	}
	
	static int Calculator (int x,int y) {
		return x/y;
	}
	
	static double Calculator (double x ,double y) {
		return x*y;
	}

	public static void main(String args[]) {
		
		int cal1=Calculator(10,30,20);
		double cal2=Calculator(30,10,20);
		int cal3=Calculator(30,20);
		double cal4=Calculator(30,20);
		
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal3);
		System.out.println(cal4);
		
	}
}
