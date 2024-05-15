package JavaPro;

import java.util.Arrays;

public class CompareOffArrays {
	
	public static void main(String args[]) {
		
		String ani[]= {"zcat","dog","elephant"};
		
		String ani1[]= {"xcat","dog","elephant"};
		
		int c=Arrays.compare(ani,ani1);
		
		System.out.println(c);
	}

}
