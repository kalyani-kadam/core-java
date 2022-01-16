class addition
{
	public static void main(String args[])
	{
		int a,b,c,d,e,f;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=(a+b);
		d=(a-b);
		e=(a*b);
		f=(a/b);
		System.out.println("Addition of two numbers is ="+c);
		System.out.println("Substraction of two numbers is ="+d);
		System.out.println("Multiplication of two numbers is ="+e);
		System.out.println("Division of two numbers is ="+f);
	}
}