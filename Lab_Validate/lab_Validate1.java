import java.util.Scanner;
public class lab_Validate1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value (x) that is between 1 and 10");//enter a value
		int x = scan.nextInt();
		System.out.println("Value chosen is "+ x);
		int sq;
		
		while (x<1 || x>10)//  not bt 1 and 10
		{
			System.out.println("Error. The integer "+x+" is not between 1 and 10");
			System.out.println("Please try again");
			System.out.println("Enter a another value (x) that is between 1 and 10");//enter a value
			x = scan.nextInt();
		}
		 // value  between 1 and 10
			sq = (int) Math.pow(x,2); // square of the value
			System.out.println("The square of " +x+ " is "+sq);
			
				
	}
}
