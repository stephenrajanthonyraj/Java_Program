package JavaPro;

public class InstanceMethod {
	
	int cost(int a, int b) {
		return a/b;
	}
public static void main(String args[]) {
	
	InstanceMethod im=new InstanceMethod();
	
	int cost =im.cost(12, 2);
	
	System.out.println(cost);
	
}
}
