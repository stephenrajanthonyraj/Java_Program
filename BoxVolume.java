package JavaPro;

public class BoxVolume {
	
	public double Volume(double l,double b,double h) {
		return l*b*h;
	}
	
	public static void main(String args[]) {
		
		BoxVolume vol=new BoxVolume();
		
		double box=vol.Volume(10.9, 20.4, 22.4);
		
		System.out.println("Rectangle Volume is a " + box);
		
		
	}

}
