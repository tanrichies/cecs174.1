import java.util.*;
public class SmallestInt
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value for x:");//value for x
		int x = scan.nextInt();
		System.out.println("Enter a value for y:");//value for y
		int y = scan.nextInt();
		System.out.println("Enter a value for z:");//value for z
		int z = scan.nextInt();
		
		if (x <= y && x <= z)// x is less than y and z
		{
			System.out.println("The smallest value was " + x);
		}
		else if (y<=x && y <=z)// y is less than x and z
		{
			System.out.println("The smallest value was " + y);
		}	
		else if (z<=x && z <=y) //z is less than x and y
		{
			System.out.println("The smallest value was " + z);
		}
	}
}
