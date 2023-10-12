package student_details_aggregate;

public class Address 
{
	
	String address;
	Student sname;
	
	public Address(String address, Student sname)
	{
		this.address = address;
		this.sname= sname;
	}
    
	public void printDetails()
	{
		System.out.println("Student name : "+sname.name);
		System.out.println("Roll no      : "+sname.rollno);
		System.out.println("Address      : "+address);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Student obj1=new Student("Anagha",1);
      Address obj2=new Address("Palakkad",obj1);
      obj2.printDetails();
      
      
      }

}
