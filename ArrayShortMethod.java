package JavaPro;

import java.util.Arrays;


public class ArrayShortMethod {
	
	public static void main(String args[]) {
		int arr[]= {33,32,43,2,3,4,5,6};
		
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
