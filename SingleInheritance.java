package JavaPro;



class Steve12{
	
	 int agep=35;
	 void romeo() { 
		System.out.println("He is a best romeo "); 
	 }
}

class ThomeshShelby extends Steve12{
	int age=8;
	void Singer() {
		System.out.println("He is a good singer");
	}
}
public class SingleInheritance {
	
	public static void main(String args[]) {
		
		ThomeshShelby thom =new ThomeshShelby();
		
		
		System.out.println(thom.agep);
		System.out.println(thom.age);
		
		thom.romeo();
		thom.Singer();
	}

}
