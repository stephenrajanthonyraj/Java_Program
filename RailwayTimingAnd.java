package JavaPro;

import java.util.Scanner;

public class RailwayTimingAnd {
	
	public static void main(String args[]){
		
		Scanner railwayTime= new Scanner(System.in);
		
		System.out.println("Enter the railway Time");
		int time = railwayTime.nextInt();
		
		
		if(time>=1 && time<=5) {
			
			System.out.println("This time train will come Trichy and Coimbatore");
		}
		else if(time>=6 && time<=10){
			
			System.out.println("This time train will come Bangalore and Chennai");
			
		}
		
		else if(time>=11 && time<=15){
			
			System.out.println("This time train will come dharmapuri and Kerala");
			
		}
		else if(time>=16 && time<=20){
			
			System.out.println("This time train will come New Delhi and Mumbai");
			
		}
		else if(time>=21 && time<=24){
			
			System.out.println("This time train will come New Delhi and Mumbai");
			
		}
		else {
			System.out.println("This time train will not come");
		}
	}


}
