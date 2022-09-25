//write a java program to display  checkboxgroup on frame
import java.awt.*;
class checkboxgroupDEMO extends Frame
{
	checkboxgroupDEMO()
	{
		FlowLayout f=new FlowLayout();
		setLayout(f);
		setBackground(Color.pink);
		setForeground(Color.blue);
		CheckboxGroup cbg=new CheckboxGroup();
		
		Checkbox c1=new Checkbox("Male",true,cbg);
		Checkbox c2=new Checkbox("Female",false,cbg);
		add(c1);
		add(c2);
	}
	public static void main(String args[])
	{
		checkboxgroupDEMO cbd=new checkboxgroupDEMO();
		cbd.setVisible(true);
		cbd.setSize(300,300);
		cbd.setTitle("CHECKBOX DEMO");
	}
}