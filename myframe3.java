//write advanced java program to display frame window
import java.awt.*;
class myframe3 extends Frame
{
	myframe3()
	{
		setVisible(true);
		setSize(600,500);
		setTitle("my frame");
	}
	public static void main(String args[])
	{
		myframe3 f1=new myframe3();
	}
}