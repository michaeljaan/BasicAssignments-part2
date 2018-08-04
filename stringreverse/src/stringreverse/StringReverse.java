package stringreverse;
//program to find string reverse
import java.util.Scanner;
public class StringReverse
{
	public static void main(String[] args)
	{
		System.out.println("Enter string to reverse:");//Enter the string
		Scanner read=new Scanner(System.in);
		
		String str=read.nextLine();//read the String
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i++)
		{
			reverse = reverse+str.charAt(i);//reverse the string
		}
		System.out.println("Reversed String is:");
		System.out.println(reverse);//output the string
	}

}
