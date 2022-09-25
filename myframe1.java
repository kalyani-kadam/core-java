//write advanced java program to display frame window
import java.awt.*;
class myframe1 extends Frame
{
	myframe1(String title)
	{
		super(title);
	}
	public static void main(String args[])
	{
		myframe1 f1=new myframe1("first window");
		f1.setVisible(true);
		f1.setSize(600,500);
		//f1.setTitle("First Frame");
	}
}