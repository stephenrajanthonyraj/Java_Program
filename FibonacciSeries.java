package JavaPro;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		  int F=15 , t1=0,t2=1;
		  
		  System.out.println("Fibonacci Series of " + F +"terms :");
		  
		  for (int i=0;i<=F;i++) {
			  
			    if(i<=15) {
			    	 
			       int 	num= t1+t2;
			       t1=t2;
			       t2=num;
			       
			       System.out.println(num);
			       
			    }
			  
		  }
				  
	}

}
