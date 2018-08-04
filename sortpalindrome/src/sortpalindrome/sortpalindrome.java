package sortpalindrome;
import java.util.Scanner;
//program to sort the String aplindrome
public class sortpalindrome
{
	public static void main(String[] args)
	{
	Scanner scanner=new Scanner(System.in);
	String [] str=new String[10];//create an  array of string
	String []rev=new String[10];//create an array of rev string
	int loc[]=new int[10];
	int size[]=new int[10];
	int id=0;
	int temp=0;
		
	for(int i=0;i<10;i++)
	{
		System.out.println("Enter a string");
		str[i]=scanner.nextLine();//Input the string
		rev[i]="";
		for(int j=str[i].length()-1;j>=0;j--)
		{
			rev[i]=rev[i] +str[i].charAt(j);//reverse string
		}
	}
	for(int i=0;i<10;i++)
	{
		if(str[i].equals(rev[i]))
		{
			loc[id]=i;
			id+=1;
		}
	}
	for(int i=0;i<id;i++)
	{
		size[i]=str[loc[i]].length();
	}
	for(int i=0;i<id;i++)//loop for sorting
	{
		for(int j=0;j<id-1;j++)
		{
			if(size[j]<size[j+1])
			{
				temp=size[j];
				size[j]=size[j+1];
				size[j+1]=temp;
				temp=loc[j];
				loc[j]=loc[j+1];
				loc[j+1]=temp;
			}
		}
	}
	System.out.println("Palindrome Strings are");
	for(int i=0;i<id;i++)
	{
		System.out.println(str[loc[i]]);//Display the output
	}
}
}
