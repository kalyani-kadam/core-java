//copy contents of one file to another file

import java.io.*;
class copycontetsoffile
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("kadam.txt");
		FileOutputStream fout=new FileOutputStream("kadam3.txt");
		int c=0;
		while((c=fin.read())!=-1)
		{
			fout.write(c);
		}
		System.out.println("file copiied succesfully");
		fin.close();
		fout.close();
	}
}