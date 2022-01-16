import java.io.*;
class filedemo
{
	public static void main(String args[])throws Exception
	{	
		File f1=new File("C:/Users/Lenovo/javaprogram/FILE HANDLING","kadam4.txt");
		System.out.println("file name="+f1.getName());
		System.out.println("file parent="+f1.getParent());
		if(f1.exists()==true)
		{
					System.out.println("file is present");
					System.out.println("file path="+f1.getPath());
					System.out.println("can read="+f1.canRead());
					System.out.println("can write="+f1.canWrite());
		}
		else
		{
					System.out.println("file is not present");
					f1.createNewFile();
					System.out.println("just created file");
					File f2=new File("C:/Users/Lenovo/javaprogram/FILE HANDLING/kadam5.txt");
					f2.mkdir();
					System.out.println("directory  created successfully");
		}
	}
}
