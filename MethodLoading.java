package JavaPro;

public class MethodLoading {
	
static int calculation(int a,int b) {
	
	return a+b;
}

static int calculation(int x,int y,int z) {
	
	return x+y+z;
}

static float calculation(float a,float b) {
	
	return a+b;
}

static double calculation(double x,double y,double z) {
	
	return x+y+z;
}
public static void main(String args[]) {
	
	int val=calculation(5,6);
	
	int val1=calculation(5,7,9);
	float val2=calculation(20.3F,30.2F);
	double val3=calculation(4.5,5.4,6.54);
	System.out.println(val);
	System.out.println(val1);
	System.out.println(val2);
	System.out.println(val3);
	
}
}
