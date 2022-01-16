class parent
{	
	int a=20;
	void display()
	{
		System.out.println("parent");
	}
}
class childextendparent
{
	int b=10;
	void show()
	{
		System.out.println("child");
	}
}
class inherit
{
			public static void main(String args[])
			{
				child obj=new child();
				parent p=new parent();
				System.out.println(obj.b);
				obj.show();
				System.out.println(p.a);
				p.display();
			}
}			