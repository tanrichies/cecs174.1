import java.util.*;
public class part_b {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value (x) that is less than or equal to 100");//enter a value
		int x = scan.nextInt();
		
		int y = (int) Math.floor(Math.random()*x);//Random int 0-x
		System.out.println("Random integer between 0 and " + x + " is " + y); //Print out integer 0-x

		if ( (y%2)==0 )// if true x is even if false x is odd
		{ 
			System.out.print("The value " + y + " is even.");
		}
		else// x would be false or odd
		{
			System.out.print("The value " + y + " is odd.");
		}
		
	}
}
