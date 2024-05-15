package JavaPro;


class College{
       private String RollNumber;
       private String Course;
       
       
       public void setRollNo(String RollNumber) {
    	   this.RollNumber=RollNumber;
    	   
       }
       
       public String getRollNo() {
           return RollNumber;
}

      public void  setCourse(String Course) {
    	  this.Course=Course;
      }
      public String getCourse() {
    	  return Course;
      }
}
      
public class encapsulationEx {
	public static void main(String args[]) {
		
		College col=new College();
		
		col.setRollNo("RSP22019");
		col.setCourse("FS");
		
		System.out.println(col.getRollNo());
		System.out.println(col.getCourse());
	}

}
