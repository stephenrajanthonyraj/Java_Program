package JavaPro;

public class InstanceVariable {
	  int a=40;
	 void myInstance() {
		 
	 }
     	
	public static void main(String args[]) {
		
		InstanceVariable  var= new InstanceVariable ();
//		local.myInstance();
		System.out.println(var.a);
	}

}
