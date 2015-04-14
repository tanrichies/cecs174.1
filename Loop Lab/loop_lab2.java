import java.util.*;

public class loop_lab2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value for the max");//enter a value
		int n = scan.nextInt();//entering the value
		System.out.println("Value is "+n);
		int x;//declaring the value
		int sum=0;//declaring sum

		while (n<0){
			System.out.println("Not a valid integer");
			System.out.println("Enter another positive value for the max");//enter a value
			n = scan.nextInt();//entering the value
		}
		for (x=0;x<=n;x++){// incrementing x
			sum  = sum + x; //the summation of each sum integer
			
		}
			System.out.println("The total is "+sum);	
	}
}
