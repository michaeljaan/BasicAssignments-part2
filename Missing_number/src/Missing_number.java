//main function to find missing number
import java.util.Scanner;

public class Missing_number 
{

	public static void main(String[] args)
	{
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of element");
		int number= scanner.nextInt();
		int array[]=new int[number];//array initialization
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<number;i++ )
		{
			array[i]=scanner.nextInt();//entering array element
		}
		int total= (number+1)*(number+2)/2;//calculate total
		for(int j=0;j<number;j++)
		{
			total-=array[j];//finding misiing number
		}
		System.out.println("The missing number is: "+total);//displaying missing number
	}

}
