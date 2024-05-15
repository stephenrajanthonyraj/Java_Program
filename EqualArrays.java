package JavaPro;

import java.util.Arrays;

public class EqualArrays {
	
	public static void main(String arg[]) {
		
		String a[]= {"red","Yellow","Green","Blue"};
		
		String a1[]= {"red","Yellow","Green","Blue"};
		
		System.out.println(a==a1);
		
		System.out.println(Arrays.equals(a, a1));
	}

}
