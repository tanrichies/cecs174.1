public class PrimitivesToStrings
{
	public static void main(String[] args)
	{
		//Hint: Use the valueOf static method in the String class to
		// return a String
		byte byteVal = -44;
		String s1 = String.valueOf(byteVal);//change byte to string
		System.out.println("String is "+s1);
		short shortVal = 12;
		String s2 = String.valueOf(shortVal);//change short to string
		System.out.println("String is "+s2);
		int intVal = 2939;
		String s3 = String.valueOf(intVal);//change int to string
		System.out.println("String is "+s3);
		long longVal = 123456L; // L indicates a long constant
		String s4 = String.valueOf(longVal);//change long to string
		System.out.println("String is "+s4);
		char charVal = 'A';
		String s5 = String.valueOf(charVal);//change char to string
		System.out.println("String is "+s5);
		float floatVal = -12.34F; // F indicates a float constant
		String s6 = String.valueOf(floatVal);//change float to string
		System.out.println("String is "+s6);
		double doubleVal = 8976.9876;
		String s7 = String.valueOf(doubleVal);//change double to string
		System.out.println("String is "+s7);
		boolean booleanVal = false;
		String s8 = String.valueOf(booleanVal);//change boolean to string
		System.out.println("String is "+s8);
	}
} 