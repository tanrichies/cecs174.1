import java.util.Scanner;
import java.util.Random;

public class homework8 {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		Random generator = new Random ();
		String status, continuing="no";
		int dollars;
		String choice = "a";
		while (!choice.equals("c")||!choice.equals("C")){// validation entry
			do{
				System.out.println("What do you want to do? A = Lucky Seven B = simulation C = quit ");
			    choice = scnr.nextLine();// menu which part do you want to do 
			    System.out.println(choice);
			    
			   while(!choice.equals("a")&&!choice.equals("A")&&!choice.equals("b")&&!choice.equals("B")&&!choice.equals("c")&&!choice.equals("C")){
			    	System.out.println("The letter is not valid. Try again.");//validation
			    	System.out.println("What do you want to do? A = Lucky Seven B = simulation C = quit ");
				    choice = scnr.nextLine();// menu which part do you want to do 
				    System.out.println(choice);

			    }
	
				if (choice.equals("a")||choice.equals("A")){
					System.out.println("You chose the game.");
					do {
						dollars = getVal();
						luckySevens(dollars,choice);
						System.out.println("Do you want to continue? yes or no");
						status = scnr.nextLine();// do you want to continue playing
					}while (status.equals("yes"));// do the game once then yes or no
				}
				else if (choice.equals("b")||choice.equals("B")){// validation entry
					int sum = 0;
					int max = 100;
					int m=0;
					for (int x=0;x<=max;x++){
					int value1 = die();
					int value2 = die();
					int roll = value1+value2;
					 sum = sum + roll;
					if (roll==7){
						m+=4;
					}else{
						m-=1;
					}
					}
					int avg = sum/100;
					System.out.println("The avg of 100 rolls is " + avg);
					System.out.println("The net gain was " +m);

					}
				
				System.out.println("Do you want to quit? 'yes' or 'no'");// do you want to continue the game?
				continuing = scnr.nextLine();
				if(continuing.equals("yes")||continuing.equals("YES")){// to end validation entry yes or no
					choice = "c";// sets choice to c to end the whole game
					}
			    
				}while(continuing.equals("no")||continuing.equals("NO"));// ending valiation entry if false
			
			if(choice.equals("c")||choice.equals("C")){
				System.exit(0);//exits the program
			}
		
	}
	}
	static void menu(){
		
	}
	static void output(int count, int countAtMax, int maxDollars, String choice){
		if (choice.equals("a")){
		System.out.println("You are broke after " + count + " rolls.");// tells you how many rolls till you are broke
		System.out.println("You should have quit after " + countAtMax + " rolls when you had $" + maxDollars + ".");
		}	// tells you when you should have quit
	}
	static int die(){
		int die;
		Random generator = new Random ();//random number generator
		die = generator.nextInt(6) +1; // generator for 6 sided die
		return die;	
	}
	static int getVal(){
		int dollars;
		Scanner scnr = new Scanner(System.in);// getting the amount of dollars
		System.out.println("How many dollars do you have?");
		dollars = scnr.nextInt();
		
		return dollars;// returning the amount of dollars
	}
	static int luckySevens(int dollars, String choice){
		int die1, die2, count, maxDollars, countAtMax;
		
		maxDollars = dollars;
		countAtMax = 0; // initializing max count
		count = 0; // initializing count
		while(dollars >0){
			count++; // incrementing count
			die1 = die(); // generator for 6 sided die
			die2 = die(); // generator for 6 sided die
			if(die1 + die2 == 7) // if the sum of both dies == 7 you win $4
				dollars += 4;//add $4
			else 
				dollars -= 1; // else if some doesnt you lose $1
			if(dollars>maxDollars){
				maxDollars = dollars; // set max amount to dollars for limit
				countAtMax = count; // set max amount to count for limit
				}
			}
		output(count, countAtMax, maxDollars, choice);
		return count;
	}
}