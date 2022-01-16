import java.util.*;
class add
{
	int a,b,c;
	Scanner input=new Scanner(System.in);
	void show()
	{
	System.out.println("enter the value of a=");
	a=input.nextInt();
	System.out.println("enter the value of b=");
	b=input.nextInt();
	c=a+b;
	System.out.print("\n addition="+c);
	}
}

class addemo
{
		public static void main(String args[])
		{
		add obj=new add();
		obj.show();
		}
}

	
