//main function to find palindrome
package palindrome;
import java.util.Scanner;
public class palindrome 
{

	public static void main(String[] args) {
		int number,temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();//enter the number to check for palindrome
		int n=number;//duplicate the number
		if(number<=0)
		{
			System.out.println("invalid number");//check for positive number only
			return;
		}
		while(number>0)//check for palindrome
		{
			int x=number%10;
			temp=temp*10 + x;
			number= number/10;
		}
		if(temp==n)//if number is palindrome
		{
			System.out.println("True");
		}
		else//if not a palindrome
		{
			System.out.println("False");
		}
	}

}
