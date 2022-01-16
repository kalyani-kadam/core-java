import java.util.*;
class heapupdate1
{
	void heapdown(int a[],int n,int i)
	{
		 int temp,j;
		 while(2*i+1<n)
		{
			 j=2*i+1;
			 
			 if(j+1 < n && a[j+1]> a[j])
			 j=j+1;
			 if(a[i]>a[j])
			 break;
			 else
			{
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				 i=j;
			}	 
		}
	}
	 void heapsort(int a[],int n)
	{
		 int i,temp;
		 for(i=(n-1)/2;i>=0;i--)
		 heapdown(a,n,i);
		 
		 while(n>0)
		{
			 temp=a[0];
			 a[0]=a[n-1];
			 a[n-1]=temp;
			 n--;
			 heapdown(a,n,0);
		} 
	} 
	 
	public static void main (String args[])
	{
		 int a[]=new int[10];
		 int n,i;
		 Scanner in=new Scanner(System.in);
		 
		 System.out.println("Enter no. of elements");
		 n =in.nextInt();
		 System.out.println("Enter elements");
		 for(i=0;i<n;i++)
		 {
			a[i]=in.nextInt();
		 } 
		 heapupdate1 ob=new heapupdate1();
		 ob.heapsort(a,n);
		 System.out.println("The sorted elements are->");
		 for(i=0;i<n;i++)
		{
			System.out.println(""+a[i]);
		}
	}
}
