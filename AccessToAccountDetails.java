package JavaPro;

public class AccessToAccountDetails {

	public static void main(String args[]) {
		
		AccountDetails ad=new AccountDetails();
		
		ad.setIfscCode("CNBK00042");
		ad.setMircCode("cn000032");
		ad.setPassword("Re@16042001");
		ad.setPin(1604);
		
		System.out.println(ad.name);
		System.out.println(ad.Accountnumber);
		System.out.println(ad.getIfscCode());
		System.out.println(ad.getMircCode());
		System.out.println(ad.getPassword());
		System.out.println(ad.getPin());
	}
}
