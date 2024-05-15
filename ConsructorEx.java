package JavaPro;

public class ConsructorEx {
	
	int age;
	String name;
	
	
	public ConsructorEx() {
		age=23;
		name="Stephen Raj";
	}
	
	public ConsructorEx(int a,String b) {
		age=a;
		name=b;
	}
	
	public ConsructorEx(ConsructorEx other) {
		age=other.age;
		name=other.name;
	}

	public static void main(String args[]) {
		
		ConsructorEx my=new ConsructorEx();
		
		System.out.println(my.age);
		System.out.println(my.name);
		
		ConsructorEx my2=new ConsructorEx(23,"Stephen");
		System.out.println(my2.age);
		System.out.println(my2.name);
		
		ConsructorEx my3=new ConsructorEx(my2);
		System.out.println(my3.age);
		System.out.println(my3.name);
	}
}
