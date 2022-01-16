//write file

import java.io.*;
class filewritedemo
{
	public static void main(String args[])throws Exception
	{
		FileOutputStream fout =new FileOutputStream("kadam1.txt");
		String str1="NAMASTE";
		byte b[]=str1.getBytes();
		fout.write(b);
		System.out.println("file written successfully");
		fout.close();
	}
}