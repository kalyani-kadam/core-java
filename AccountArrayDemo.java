//Write a java program to create student class AccountArrayDemo having data memmbers as Acc_no, name, balance. accept data for five object using array of object concept. 

import java.util.*;
class AccountArrayDemo
{
	int Acc_no;
	String name;
	float balance;

	void get_account_info()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ACCOUNT NO:");
		Acc_no=sc.nextInt();
		System.out.println("ENTER CUSTOMER NAME:");
		name=sc.next();
		System.out.println("ENTER ACCOUNT BALANCE:");
		balance=sc.nextFloat();
	}
	void disp_account_info()
	{
		//System.out.println("**************BANK MANAGEMENT SYSTEM*****************");
		System.out.println("ACCOUNT NO   :"+Acc_no);
		System.out.println("CUSTOMER NAME:"+name);
		System.out.println("ACCOUNT BALANCE:"+balance);
	}
	public static void main(String args[])
	{
		//datatype variable name[]=new dtatype[size];
		//int a[]=new int[5];
		 AccountArrayDemo a[]=new  AccountArrayDemo[5];
		 int i;
		 
		 for(i=0;i<5;i++)
		 {
			 a[i]=new  AccountArrayDemo();
		 }
		 for(i=0;i<5;i++)
		 {
			 a[i].get_account_info();
		 }
		 for(i=0;i<5;i++)
		 {
			 a[i].disp_account_info();
		 }
	}
}