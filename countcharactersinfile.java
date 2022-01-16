//write a program that will cout no. of characters in a file
import java.io.*;
class countcharactersinfile
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("kadam.txt");
		int c,count=0;
		while((c=fin.read())!=-1)
		{
			count++;
		}
		System.out.println("no of characters in file="+count);
		fin.close();
	}
}