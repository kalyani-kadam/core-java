//write a program to read contents of file(byte oriented)
import java.io.*;               //fin is  byte stream object
class filereaddemo
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fin=new FileInputStream("kadam.txt");
		int c=0;
		while (c!=-1)
		{
			c=fin.read();
			System.out.print((char)c);  //for type casting char is used
		}
		fin.close();
	}
}