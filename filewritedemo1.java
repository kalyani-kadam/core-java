//write file

import java.io.*;
class filewritedemo1
{
	public static void main(String args[])throws Exception
	{
		File f=new File("kadam2.txt");
		FileWriter fw =new FileWriter("kadam2.txt");
		String str1="NAMASTE";
		fw.write(str1);
		System.out.println("file written successfully");
		fw.close();
	}
}