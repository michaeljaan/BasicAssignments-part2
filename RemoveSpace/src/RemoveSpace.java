//main function to remove space in string
import java.util.*;

class RemoveSpace 
{
	public static void main(String args[]) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String with Spaces");
		String input = sc.nextLine();//input string
		StringBuilder str = new StringBuilder();
		int flag = 0;
		
		for (int i = 0; i < input.length(); i++) 
		{
			if (input.charAt(i) != ' ') 
			{
				str.append(input.charAt(i));
				//if space is not there,set flag to zero
				flag = 0;
			} 
			else 
			{
				flag++;
				//adding the space after each word
				if (flag == 1) 
				{
					str.append(" ");
				}
			}

		}

		System.out.println("Sentence without spaces = " + str.toString());//output string

	}
}
