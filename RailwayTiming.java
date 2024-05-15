package JavaPro;

import java.util.Scanner;

public class RailwayTiming {
	
	public static void main(String args[]){
		
		Scanner railwayTime= new Scanner(System.in);
		
		System.out.println("Enter the railway Time");
		int time = railwayTime.nextInt();
		
		
		if(time==4||time==5) {
			
			System.out.println("This time train will come Trichy and Coimbatore");
		}
		else if(time==6||time==7){
			
			System.out.println("This time train will come Bangalore and Chennai");
			
		}
		
		else if(time==8||time==9){
			
			System.out.println("This time train will come dharmapuri and Kerala");
			
		}
		else if(time==10||time==11){
			
			System.out.println("This time train will come New Delhi and Mumbai");
			
		}
		else {
			System.out.println("This time train will not come");
		}
	}

}
