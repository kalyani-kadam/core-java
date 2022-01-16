//CREATION OF THREAD BY IMPLEMENTING RUNNABLE INTERFACE

class runnablex implements Runnable
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("from threadx :i:"+i);
		}
	}
}
class runnabley implements Runnable
{
	public void run()
	{
		for (int j=1;j<=5;j++)
		{
			System.out.println("from thready :j:"+j);
		}
	}
}
class runnablez implements Runnable
{
	public void run()
	{
		for (int k=1;k<=5;k++)
		{
			System.out.println("from threadz :k:"+k);
		}
	}
}
class runnabledemo
{
	public static void main(String args[])
	{
			runnablex r1=new runnablex();
			runnabley r2=new runnabley();
			runnablez r3=new runnablez();
			
			Thread t1=new Thread(r1);
			Thread t2=new Thread(r2);
			Thread t3=new Thread(r3);
			
			t1.start();
			t2.start();
			t3.start();
	}
}