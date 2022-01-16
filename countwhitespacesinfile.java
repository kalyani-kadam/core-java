//write a program that will count no. of characters in a file
import java.io.*;
class countwhitespacesinfile
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("kadam.txt");
		int c,count=0;
		while((c=fin.read())!=-1)
		{
			char ch=(char)c;
			if(c==' ')
			{
				count++;
			}
		}
		System.out.println("no of white spaces in file="+count);
		fin.close();
	}
}