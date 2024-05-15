package JavaPro;

public class BooleanMethod {
	
	boolean bloodGroup(int age,String group) {
	
		int blood=age;
		return blood>=age;
	}
 
	public static void main(String args[]) {
	
		 BooleanMethod bg=new BooleanMethod();
		 
		 boolean bgroup=bg.bloodGroup(18,"b+ve");
		 
		 if(bgroup) {
			 
			 System.out.println("your are eligeble");
			 
		 }
		 else {
			 System.out.println("your are not eligeble");
		 }
		 
	}
}
