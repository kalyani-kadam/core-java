//Write a java program to create student clas Tendor having data memmbers as company_name,cost. accept data for five object using array of object concept. 

import java.util.*;
class Tendor
{
	String company_name;
	float cost;

	void get_tendor_info()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER COMPANY NAME:");
		company_name=sc.next();
		System.out.println("ENTER TENDOR COST:");
		cost=sc.nextFloat();
	}
	void disp_tendor_info()
	{	
		/*
		System.out.println("**************TENDOR MANAGEMENT SYSTEM*****************");
		System.out.println("COMPANY NAME:"+company_name);
		System.out.println("COST        :"+cost);
		*/
		System.out.println(company_name+"\t"+cost);
	}
	public static void main(String args[])
	{
		//datatype variable name[]=new dtatype[size];
		//int a[]=new int[5];
		 Tendor a[]=new Tendor[5];
		 int i;
		 
		 for(i=0;i<5;i++)
		 {
			 a[i]=new Tendor();
		 }
		 for(i=0;i<5;i++)
		 {
			 a[i].get_tendor_info();
		 }
		 System.out.println("****************************************************");
		 System.out.println("*************TENDOR MANAGEMENT SYSTEM***************");
		 System.out.println("****************************************************");
		 System.out.println("NAME\tCOST");
		System.out.println("=======================");
		 for(i=0;i<5;i++)
		 {
			 a[i].disp_tendor_info();
		 }
	}
}