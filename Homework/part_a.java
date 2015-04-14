import java.util.*;
public class part_a 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value for theta:");//value for theta
		double x = scan.nextDouble();
		
		double sinval = Math.sin(x);//sin of theta
		double cosval = Math.cos(x);//cos of theta
		double sinsq = Math.pow(sinval, 2);	// sin^2
		double cossq = Math.pow(cosval, 2);	// coz^2
		double value = (sinsq + cossq); //adding squared values sin^20 + cos^20
		double eps = 1e-14;
		
		if ((Math.abs(value-1))<= eps){
		
			System.out.println("1");
		}
		

		System.out.println("Answer is " +value);

		double math = Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x),2);//All in one line
		System.out.println("Answer is " +math);
	
	}

}
