package JavaPro;

import java.util.List;
import java.util.Arrays;

public class AsListMethod {
	
	public static void main(String args[]) {
		
		String array[]= {"apple","mango","banana","grephs"};
		
		List<String> list=Arrays.asList(array);
		
		System.out.println(list);
		
		for(String i: array) {
			System.out.println(i);
		}
	}
}
