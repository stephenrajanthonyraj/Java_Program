package JavaPro;



public class Hxagon {
	
	public double area(double p) {
		
		double a=p/6;		
		return 3*Math.sqrt(3)*Math.pow(a, 2)/2;
	}
	public static void main (String args[]) {
		Hxagon myData=new Hxagon();
		double area=myData.area(18);
		System.out.println("Hxagon Area is "+ area);
		
	}

}
