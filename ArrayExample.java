package JavaPro;

public class ArrayExample {
	
	public static void main(String args[]) {
		
		int a[]= {0,1,2,3,4,5,6};
		
		
		a[3]=5;
	    
	    int len=a.length;
	    System.out.println(len);
		
	    System.out.println();
	    
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		String data[]= {"hi","hello","welcome","hey","bye"};
		
		
		
		for (int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		System.out.println();
		data[2]="oi!";
		for (int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		System.out.println();
		
		for (String i: data) {
			System.out.println(i);
		}
		System.out.println();
		String flower[]= {"Lilly","rose","water lilly","sun flower","jasmine"};
		for (String i: flower) {
			System.out.println(i);
		}
		flower[3]="lavander";
		for (String i: flower) {
			System.out.println(i);
		}
		
		
		
		//2-d array
		
		System.out.println();
		int num[][]= {{121,222,333,453,456,564},{454,676,776,554,322,565}};
		System.out.println(num[0][4]);
		System.out.println(num[1][2]);
		System.out.println(num[1][3]);
		System.out.println(num[0][5]);
		System.out.println();
		
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		} 
		System.out.println();
		//intialization
		
		
		int c[][]= {{2,3,4,5},{4,6,7,5},{6,7,8,9}};
		
		c[0][0]=2;
		c[0][1]=3;
		c[0][2]=4;
		c[0][3]=5;
		
		c[1][0]=4;
		c[1][1]=6;
		c[1][2]=7;
		c[1][3]=5;
		
		c[2][0]=6;
		c[2][1]=7;
		c[2][2]=8;
		c[2][3]=9;
		
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println() ;
		}
		
		
		
	}

}
