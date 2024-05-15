package JavaPro;

class Stephen{
	public void myMethod() {
		System.out.println("I'm learning Java");
	}
} 

class Steve extends Stephen{
	public void myMethod() {
		super.myMethod();
		System.out.println("I'm also learning Java");
	}
}

public class MethodOverRiding {
	
	public static void main(String args[]) {
		
		Steve myObj= new Steve();
		
		myObj.myMethod();
	}

}
 