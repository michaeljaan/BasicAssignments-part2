//main function
import java.util.Scanner;
public class Discount
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double newItem=0.0;//cost price
		double discount=0.0;//discount amount
		double newItemPrice=0.0;//selling price
		
		System.out.println("Enter the Original Price of item:");
		newItem= sc.nextDouble();
		discount=newItem*0.35;//discount price calculation
		
		newItemPrice=newItem-discount;//selling price
		
		System.out.println("The new price of item is : "+newItemPrice);//display selling price
	}
}
