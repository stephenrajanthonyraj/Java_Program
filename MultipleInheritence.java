package JavaPro;

class Ooty{
	int cost=1000;
	void Nature() {
		System.out.println("Like a Nature");
	}
}

class Kerla extends Ooty{
	int expan=2000;
	
	void Views() {
		
		System.out.println("Seen neture senorio");
	}
}

class Goa extends Kerla {
	int amt= 30000;
	
	void VisitTemple() {
			
		System.out.println("Visit the temple");
	}
}

public class MultipleInheritence {
	
	public static void main(String args[]) {
		
		Goa goa=new Goa();
		goa.Nature();
		goa.Views();
		goa.VisitTemple();
		
		System.out.println(goa.amt);
		System.out.println(goa.cost);
		System.out.println(goa.expan);
		
		
		System.out.println();
		
		
		Kerla ker= new Kerla();
		ker.Nature();
		ker.Views();
		
		System.out.println(ker.cost);
		System.out.println(ker.expan);
		
	}

}
