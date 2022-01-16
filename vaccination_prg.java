import java.util.*;
class corona 
{
	String name;
	int aadhaar_no;
	int age;
	String vaccine_name;
	String centre_name;
	int pincode;
	void get_details()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME:");
		name=sc.next();
		System.out.println("ENTER YOUR ADHAAR NUMBER:");
		aadhaar_no=sc.nextInt();
		System.out.println("ENTER YOUR AGE:");
		age=sc.nextInt();
		System.out.println("ENTER VACCINE NAME:");
		vaccine_name=sc.next();
		System.out.println("ENTER NEAR CENTRE NAME:");
		centre_name=sc.next();
		System.out.println("ENTER CENTRE PINCODE:");
		pincode=sc.nextInt();
	}
	void put_details()
	{
		System.out.println("***************************************");
		System.out.println("*********VACCINATION DETAILS***********");
		System.out.println("***************************************");
		System.out.println("NAME:"+name);
		System.out.println("ADHAAR NUMBER:"+aadhaar_no);
		System.out.println("AGE:"+age);
		System.out.println("VACCINE NAME:"+vaccine_name);
		System.out.println("CENTRE NAME:"+centre_name);
		System.out.println("CENTRE PINCODE:"+pincode);	
	}
	public static void main(String args[])
	{
	corona c1=new corona();
	c1.get_details();
	c1.put_details();
}
}