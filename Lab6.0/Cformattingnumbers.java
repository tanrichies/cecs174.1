import java.util.Scanner;
public class Cformattingnumbers
{

	public static void main(String[] args)
   {
   

      Scanner scnr = new Scanner(System.in); 
	  System.out.print("Enter meters to be converted to miles, feet, and inches."); //prompt meters to be inputed
	  double m = scnr.nextInt();

	  double miles = m * 0.000621371; //conversion for meters to miles
	  double feet = m * 3.28084;	//conversion for meters to feet
	  double inches = m * 39.3701; //conversion for meters to inches
	  System.out.println("The output is:");
	  System.out.printf("Miles:%5.2f", miles);
	  System.out.println("");				//separation
	  System.out.printf("Feets:%5.2f", feet);
	  System.out.println("");				//separation
	  System.out.printf("Inches:%5.2f", inches);
   } 
} 