//WRITE JAVA PROGRAM TO IMPLEMENT SWITCH CASE
import java.util.*;
class switch_case_vowel
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		char ch;
		System.out.println("Enter Any Character:");
		ch=sc.next().charAt(0);
		
		switch(ch)
		{
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':System.out.println(ch+" is vowel");
						break;
				default:System.out.println(ch+" is not vowel");
		}
	}
}