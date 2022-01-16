//WRITE JAVA PROGRAM  TO IMPLEMENT SWITCH CASE

import java.util.*;
class calc_switch_case
{
	public static void main(String args[])
	{
		int a,b,c,ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***********************************");
		System.out.println("************CALCULATOR*************");
		System.out.println("***********************************");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Remainder");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1: System.out.println("Enter First NO:");
					a=sc.nextInt();
					System.out.println("Enter Scond NO:");
					b=sc.nextInt();
					c=a+b;
					System.out.println("ADDITION="+c);
					break;
			case 2: System.out.println("Enter First NO:");
					a=sc.nextInt();
					System.out.println("Enter Scond NO:");
					b=sc.nextInt();
					c=a-b;
					System.out.println("SUBSTRACTION="+c);
					break;
			case 3: System.out.println("Enter First NO:");
					a=sc.nextInt();
					System.out.println("Enter Scond NO:");
					b=sc.nextInt();
					c=a*b;
					System.out.println("MULTIPLITION="+c);
					break;
			case 4: System.out.println("Enter First NO:");
					a=sc.nextInt();
					System.out.println("Enter Scond NO:");
					b=sc.nextInt();
					c=a/b;
					System.out.println("DIVISION="+c);
					break;
			case 5: System.out.println("Enter First NO:");
					a=sc.nextInt();
					System.out.println("Enter Scond NO:");
					b=sc.nextInt();
					c=a%b;
					System.out.println("REMAINDER="+c);
					break;
			default:System.out.println("ENTER VALID CHOICE");
		}
	}		
}