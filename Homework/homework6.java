import java.util.Scanner;
public class homework6 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Marital status: single or married (case sensitive)");
		String status = scan.nextLine();//entering marital status
		System.out.println("Enter income");//enter a value
		double income = scan.nextDouble();//entering income value
		System.out.println("Income is "+ income);
		double taxAmount=0;
		double taxTotal=0;
		
		while ( status.equals("single")) {
			if (income>=0 && income<8000){
				taxAmount = .10 * income;
				taxTotal = income + taxAmount;
				
		}
			if (income>=8000 && income<32000){
				taxAmount = 800 + (.15 * income);
				taxTotal = income + taxAmount;
		}
			if (income>=32000){
				taxAmount = 4400 + (.25 * income);
				taxTotal = income + taxAmount;
		}
			System.out.println("Tax amount is "+ taxAmount);
			System.out.println("Total tax is "+ taxTotal);

		}
		while ( status.equals("married")) {
			if (income>=0 && income<16000){
				taxAmount = .10 * income;
				taxTotal = income + taxAmount;
		}
			if (income>=16000 && income<64000){
				taxAmount = 1600 + (.15 * income);
				taxTotal = income + taxAmount;
		}
			if (income>=64000){
				taxAmount = 8800 + (.25 * income);
				taxTotal = income + taxAmount;
		}
			System.out.println("Tax amount is "+ taxAmount);
			System.out.println("Total tax is "+ taxTotal);
		}

	}
}