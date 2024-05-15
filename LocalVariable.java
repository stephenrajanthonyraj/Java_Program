package JavaPro;

public class LocalVariable {
	
	 void myLocal() {
		 int a=30;
		 System.out.println(a);
	 }
     	
	public static void main(String args[]) {
		
		LocalVariable local= new LocalVariable();
		local.myLocal();
	}

}
