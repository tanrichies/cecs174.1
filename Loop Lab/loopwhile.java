public class loopwhile {
	public static void main(String[] args){
		
	int x=0;
	int sum=0;
	while (x<101){ // while the value is still within constraint run statement
		sum = sum+x;//incremental addition
		x=x+1;//incrementing by 1
	}
	System.out.println("The total is "+sum);

	}
}
