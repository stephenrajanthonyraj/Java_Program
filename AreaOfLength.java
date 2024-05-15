package JavaPro;

public class AreaOfLength {
	
	public double Area(double b,double h) {
		return 0.5*b*h;
	}	
	public static void main(String args[]) {
			AreaOfLength myObj=new AreaOfLength();
//			double area=myObj.Area(20.4, 25.2);
//			System.out.println("triangle Area is "+ area);
			System.out.println("triangle Area is "+ myObj.Area(20.4, 25.4));
			
		}
	
}
