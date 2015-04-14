package method;

import java.util.Scanner;

class MethodLabMain {
	public static void main(String[] args){
		int value;
		welcome();
		value = getVal();
		boolean value1 = isValid(value);
		while (value1 == false){
			Scanner scan = new Scanner(System.in);
			System.out.println(value + " Is not a valid integer");
			System.out.println("Enter another positive value for the max");//enter a value
			value = scan.nextInt();//entering the value
			if (value>0){
				value1 = true;
			}}
				
		value = calculation(value);
		answer(value);

	}
	
	static void welcome(){
		System.out.println("Welcome, please enter a postive value for the max");//enter a value
	}
	
	static int getVal(){// asking the user for the value
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();//entering the value
		return value; //returning given value
	}
		
	static boolean isValid(int value){
		if (value<0){// if the value is less than 0 or negative show an error, try again
			return false;
		}else
		return true;// else return true
	}
	static int calculation(int value){
		int x;//declaring the value
		int sum=0;//declaring sum
		
		for (x=0;x<=value;x++){// incrementing x
			sum  = sum + x; //the summation of each sum integer
		}
		return sum;
	}
	static void answer(int sum){
		System.out.println("The total is "+sum);//print out the summation	
	}
}
