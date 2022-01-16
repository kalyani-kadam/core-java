class Thiskeydemo
{
	int x,y,z;
	void getdata()
	{
		x=10;
		y=20;
		z=30;
	}
	void putdata()
	{
			System.out.println("value of x="+x);
			System.out.println("value of y="+y);
			System.out.println("value of z="+z);
	}
	public static void main(String args[])
	{
			Thiskeydemo t1=new Thiskeydemo();
			t1.getdata();
			t1.putdata();
	}
}