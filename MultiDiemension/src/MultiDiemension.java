import java.util.*;//importing packages

public class MultiDiemension 
{

	public static void main(String[] args)//Main function
	{
		int number;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the element to be searched from a multidimensional array");
    	number=scanner.nextInt();//enter element to be searched
    	
    	int matrix[][]= { {10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50} };//array initialization
    	search(matrix,4,number);//function calling
    }
	
	
    private static void search(int [][] matrix, int n, int x)//function
    {
    	int i=0,j=n-1;
    	while(i<n && j>=0) {
    		if(matrix[i][j]==x) 
    		{
    			System.out.println(x+" Found at "+(i+1)+"-row "+(j+1)+"-column");//output rows and column
    			return;
    		}
    		if(matrix[i][j]>x)
    			j--;
    		else
    			i++;
    	}
    	System.out.println(x+" Element not found");
    	return;
    }

}

