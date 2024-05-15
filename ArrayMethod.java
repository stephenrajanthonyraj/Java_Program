package JavaPro;

import java.util.Arrays;

public class ArrayMethod {
	
	public static void main(String args[]) {
		
		int array[]=new int [7];
		array[0]=11;
		for (int i:array) {
			System.out.println(i);
		}
		
		array[0]=11;
		
		
		System.out.println();
		int array2[]=Arrays.copyOf(array, 7);
		array2[0]=34;
		
		for (int i: array2) {
			System.out.println(i);
		}
		
		
		
				
	}

}
