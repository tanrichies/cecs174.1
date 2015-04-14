public class StringConversion
{
	public static void main(String[] args)
	{
		String value1 = "12345";
		int intValue = Integer.parseInt(value1);
		System.out.println("intValue = " + intValue);
		String value2 = "12.345";
		double doubleValue = Double.parseDouble(value2);	    // Convert value2 to a double here
		System.out.println("doubleValue = " + doubleValue);	    // Print the converted value
 
		String value3 = "87654";
		long longValue = Long.parseLong(value3);		        // Convert value3 to a long here
		System.out.println("longValue = " + longValue);		    // Print the converted value

		String value4 = "321";
		short shortValue = Short.parseShort(value4);       	    // Convert value4 to a short here
		System.out.println("shortValue = " + shortValue);		// Print the converted value
		
		String value5 = "-28";
		byte byteValue = Byte.parseByte(value5); 		   	    // Convert value5 to a byte here
		System.out.println("byteValue = " + byteValue);			// Print the converted value
		
		String value6 = "6";
		char charValue = value6.charAt(0);  			    	// Convert value6 to a char here. (Hint: See Advanced Topic 4.5)
		System.out.println("charValue = " + charValue);     	// Print the converted value
		
		String value7 = "true";
		Boolean booleanValue = Boolean.valueOf(value7);			// Convert value7 to a boolean here. (Hint: Check the API for the
		System.out.println("booleanValue = " + booleanValue);	// Boolean wrapper class. Which method returns a Boolean?)
		                                                        // Print the converted value

		String value8 = "-45.237";
		float floatValue = Float.parseFloat(value8); 			// Convert value7 to a float here 
		System.out.println("floatValue = " + floatValue);		// Print the converted value
 }
}