import java.util.*;
public class Lab_Validate {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value (x) that is between 1 and 10");//enter a value
		int x = scan.nextInt();
		System.out.println("Value chosen is "+ x);
		int sq;
		boolean ck = true;
		
		while (ck==true)// loop to true
		{
			if (1<=x && x<=10)// value constraints 1-10
			{
				
				sq = (int) Math.pow(x,2); // square of the value
				System.out.println("The square of " +x+ " is "+sq);
				ck=false;
			}
			else {// value not between 1 and 10
				System.out.println("Error. The integer "+x+" is not between 1 and 10");
				System.out.println("Please try again");
				System.out.println("Enter a another value (x) that is between 1 and 10");//enter a value
				x = scan.nextInt();
				sq = (int) Math.pow(x,2); // square of the value
			}
		}		
	}
}
