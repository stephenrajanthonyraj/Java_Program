package JavaPro;

public class AccountDetails {
	
	
	String name="Stephen Raj";
	String Accountnumber="1262119004532";
	private String IfscCode;
	private String password;
    private String MircCode;
    private int pin;
    
    
    public void setIfscCode(String IfscCode) {
    	this.IfscCode=IfscCode;
    	
    }
    public String getIfscCode() {
    	return IfscCode;
    	
    }
    
    public void setPassword(String password) {
    	this.password=password;
    	
    }
    public String getPassword() {
    	return password;
    }

    public void setMircCode(String MircCode) {
    	this.MircCode=MircCode;
    	
    }
    public String getMircCode() {
    	return MircCode;
    }
    
    public void setPin(int pin) {
    	this.pin=pin;
    	
    }
    public int getPin() {
    	return pin;
    }
}
