package JavaPro;

class Sirder{
	
	 int agep=35;
	 void romeo() { 
		System.out.println("He is a best romeo "); 
	 }
}

class Thomesh extends Sirder{
	int age=8;
	void singer() {
		System.out.println("He is a good singer");
	}
}

class JhonSnow extends Sirder{
	
	int ag =6;
	
	void multipleAbility() {
		System.out.println("he is very good at romeo and Acting but he is MutiTasker");
	}
}

public class HierarchicalInheritance {
	
	public static void main(String args[]) {
		
		JhonSnow mul= new  JhonSnow();
		
		mul.multipleAbility();
		mul.romeo();
		
		System.out.println(mul.ag);
        System.out.println(mul.agep);
		
		Thomesh sin= new Thomesh();
		
		sin.singer();
		sin.romeo();
		
		System.out.println(sin.age);
        System.out.println(sin.agep);
        
		
		
		
	}

}
