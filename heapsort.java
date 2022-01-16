
import java.util.*;
class heapsort
{
	public static void main(String args[])
	{
		//int[] arr=(119,71,818,762,626,717,99,11);
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
		heapsort hs =new heapsort();
		hs.sort(a);
		hs.printarray(a);
	}
	void sort(int[] a)
	{
		int leng=a.length;
		
		for(int i=leng/2-1;i>=0;i--)
		{	
			heapify(a,leng,i);
		}
		//swap the elements and heapify again
		for(int i=leng-1;i>=0;i--)
		{	
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			
			heapify(a,i,0);
		}
	}
	void heapify(int[] a,int n,int i)
	{	
		int largest=i;				//parent node index position
		int li=2*i+1;				//left clild node index position
		int ri=2*i+2;				//right child node index position
		
		if(li<n && a[li]>a[largest])
		{	
			largest=li;
		}
		if(ri<n && a[ri]>a[largest])
		{	
			largest=ri;
		}
		if(largest !=i)
		{	
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			
			heapify(a,n,largest);
		}
	}
	void printarray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}	
}