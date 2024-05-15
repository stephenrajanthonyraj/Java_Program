 package JavaPro;

 abstract class Cake{
	 
	 abstract void toppingsOnCake();
	 
	 void flavour() {
		 System.out.println("Blueberry Cake");//concrete method
	 }
	 
 }
 
public class AbstractEx extends Cake {
//concrete class
	@Override
	void toppingsOnCake() {
		
		System.out.println("pineapple Crush,choco Chips");
		
	}
	
	public static void main(String args[]) {
		
		AbstractEx ae=new AbstractEx();
		
		ae.flavour();
		ae.toppingsOnCake();
		
		
		
	}

}
