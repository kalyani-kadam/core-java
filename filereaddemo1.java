//write a program to read contents of file (character oriented)
import java.io.*;               //fin is  byte stream object
class filereaddemo1
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("kadam.txt");
		int c=0;
		while (c!=-1)
		{
			c=fr.read();
			System.out.print((char)c);
		}
		fr.close();
	}
}