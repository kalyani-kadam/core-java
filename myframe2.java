//write advanced java program to display frame window
import java.awt.*;
class myframe2 extends Frame
{
	myframe2(String title)
	{
		setVisible(true);
		setSize(600,500);
		setTitle(title);
	}
	public static void main(String args[])
	{
		myframe2 f1=new myframe2("HELLO KALYANI ");
	}
}