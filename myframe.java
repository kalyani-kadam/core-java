//write advanced java program to display frame window
import java.awt.*;
class myframe extends Frame
{
	myframe(String title)
	{
		super(title);
	}
	public static void main(String args[])
	{
		myframe f1=new myframe();
		f1.setVisible(true);
		f1.setSize(600,500);
		//f1.setTitle("First Frame");
	}
}