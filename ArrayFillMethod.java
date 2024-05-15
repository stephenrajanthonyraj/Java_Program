package JavaPro;

import java.util.Arrays;

public class ArrayFillMethod {
	
	public static void main(String args[]) {
		
		int a[]=new int [5];
		
		Arrays.fill(a, 9);
		
		a[2]=26;
		
		for(int i:a) {
			System.out.println(i);
		}
	}

}
