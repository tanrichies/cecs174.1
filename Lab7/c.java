import java.util.*;

public class c
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int x = scan.nextInt();
		
		if ( (x%2)==0 )// if true x is even if false x is odd
		{ 
			System.out.print("The value " + x + " is even.");
		}
		else// x would be false or odd
		{
			System.out.print("The value " + x + " is odd.");
		}
		
		
	}
}
