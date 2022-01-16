import java.util.*;
class arraycopydemo
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five elements:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			b[i]=a[i];
		}
		System.out.println("copied array b elements:");
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}