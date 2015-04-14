import java.util.*;
public class ArrayLab1 {
	
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);//import scanner
	double [] Array = new double [10];
	for (int i=0;i<10;i++){//increment array 0-9 or 1-10
		int s=i+1;//i+1 for correct cell
	System.out.println("Please enter a value for Cell "+s+".");
	Array[i] = scan.nextDouble();//input the array in to cell
	}
	for (int i=0;i<10;i++){//increment array 0-9 1-10
		int s=i+1;//i+1 for correct cell
		System.out.println("Element "+s+ " is " + Array[i]);//show the element and cell.
	}
	}
}