//write a java program of addition of two nos
import java.util.*;
class additiondemo
{
	int a,b,c;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NO:");
		a=sc.nextInt();
		System.out.println("ENTER SECOND NO:");
		b=sc.nextInt();
	}
	void display()
	{
		c=a+b;
		System.out.println("ADDITION OF TWO  NO:"+c);
	}
	public static void main(String args[])
	{
		additiondemo d=new additiondemo();
		d.getdata();
		d.display();
	}	
}