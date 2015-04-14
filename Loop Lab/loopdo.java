public class loopdo {
	public static void main(String[] args){
		
		int x=0;
		int sum=0;
		do {
			sum = sum+x; // do this first(at least once)
			x=x+1;//incrementing by 1
		}
		while (x<101); // after the first run do until value is less than x
		System.out.println("The total is "+sum);

	}

}
