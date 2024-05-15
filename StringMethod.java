package JavaPro;

public class StringMethod {
	
	public static void main(String args[]) {
		//
//		String s="steve";//store in only Scp-String Constant Pool
//		String a=new String("lucifer");//store on both scp and heap
//		
//		
//		String alpha="abcdefghijklmnopqrstuvwxyz";
//		
//		String alpha1="abcdefghijklmnopqrstuvwxyz";
//		
//		System.out.println(alpha.length());
//		
//		System.out.println(alpha.substring(0,5));
//		
//		System.out.println(alpha.indexOf("y"));
//		
//		System.out.println(alpha.isBlank());
//		
//		System.out.println(alpha.isEmpty());
//		
//		System.out.println(alpha.endsWith("z"));
//		
//		System.out.println(alpha.toUpperCase());
//		
//		System.out.println(alpha.charAt(5));
//		
//		System.out.println(alpha.concat(alpha1));
//		
//		System.out.println(alpha.equals(alpha1));
//		
//		System.out.println(alpha.replace("ab", "AB"));
//		
//		String world="It feild \"going on very complicately\"";
//		
//		System.out.println(world);
//		
		
		///StringBuffer
		
		StringBuffer str=new StringBuffer("Lonly");
		
		System.out.println(str.append("Explorer"));
		
		System.out.println(str.insert(1,"iam"));
		
		System.out.println(str.delete(1, 4));
		
		System.out.println(str.reverse());
		
		System.out.println(str.indexOf("n"));
		
		System.out.println(str.replace(0, 1, "\'"));
		
		System.out.println(str.reverse());
		
		System.out.println(str.replace(0, 1, "\'"));
		
		System.out.println(str.insert(1,"iam"));
		
		System.out.println(str.insert(4,"L"));
		
		System.out.println(str);
		
		StringBuffer myObj=new StringBuffer("Hai");
		
		System.out.println(myObj.capacity());
		
		
	}

}
