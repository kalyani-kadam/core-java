//CREATION OF THREAD BY EXTENDING SUBCLASS

class threadx extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("from threadx class :i:"+i);
		}
	}
}
class thready extends Thread
{
	public void run()
	{
		for (int j=1;j<=5;j++)
		{
			System.out.println("from thready class :j:"+j);
		}
	}
}
class threadz extends Thread
{
	public void run()
	{
		for (int k=1;k<=5;k++)
		{
			System.out.println("from threadz class :k:"+k);
		}
	}
}
class mainthread
{
	public static void main(String args[])
	{
			threadx t1=new threadx();
			thready t2=new thready();
			threadz t3=new threadz();
			
			t1.start();
			t2.start();
			t3.start();
	}
}
