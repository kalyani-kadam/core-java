//Write a java program to create student class having data memmbers rollno, name, marks ,grade , accept and display for one object.

import java.util.*;
class Student
{
	
	int rollno;
	float marks;
	String name;
	char grade;

	void get_stud_info()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STUDENT ROLL NO:");
		rollno=sc.nextInt();
		System.out.println("ENTER STUDENT NAME:");
		name=sc.next();
		System.out.println("ENTER STUDENT MARKS:");
		marks=sc.nextFloat();
		System.out.println("ENTER STUDENT GRADE:");
		grade=sc.next().charAt(0);
	}
	void disp_stud_info()
	{
		System.out.println("**************STUDENT MANAGEMENT SYSTEM*****************");
		System.out.println("STUDENT ROLL NO:"+rollno);
		System.out.println("STUDENT NAME:"+name);
		System.out.println("STUDENT MARKS:"+marks);
		System.out.println("STUDENT GRADE:"+grade);
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.get_stud_info();
		s1.disp_stud_info();
	}
	
}