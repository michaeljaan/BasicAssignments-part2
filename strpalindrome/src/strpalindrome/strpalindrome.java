package strpalindrome;
import java.util.Scanner;
//main program to find String palindrome
public class strpalindrome 
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string to be reverse:");//input the word
	String str= sc.nextLine();
		
	String [] words = str.split(" ");//Split the sentence
	String reverse="";
	for(int i=0;i<words.length;i++)
	{
		for(int j=words[i].length()-1;j>=0;j--)
		{
			reverse += words[i].charAt(j);//reverse the word
		}
		System.out.print(reverse + " ");
		reverse = "";
	}
	}

}
