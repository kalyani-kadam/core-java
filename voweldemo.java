//write a java program to check entered alphabet is vowel or not.
import java.util.*;
class voweldemo
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		char ch;
		System.out.println("Enter Any Character:");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='A')
		{
			System.out.println("Entered Alphabet is Vowel");
		}
		else if(ch=='e' || ch=='E')
		{
			System.out.println("Entered Alphabet is Vowel");
		}
		else  if(ch=='i' || ch=='I')
		{
			System.out.println("Entered Alphabet is Vowel");
		}
		else if(ch=='o' || ch=='O')
		{
			System.out.println("Entered Alphabet is Vowel");
		}
		else if(ch=='u' || ch=='U')
		{
			System.out.println("Entered Alphabet is Vowel");
		}
		else 
		{
			System.out.println("Entered Alphabet is not Vowel");
		}
	}
}