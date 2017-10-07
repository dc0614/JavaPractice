/*
	Diana Copeland
	Try This 1-2	Improving the Gallons-to-Liters Converter
*/
//import for DecimalFormat
import java.text.*;

class GalToLitTable	{
	public static void main(String[] args)	{
		//declare variables 
		double gallons, liters;
		//declare and initialize counter
		int counter = 0;
		
		//declare and initialize a DecimalFormat
		DecimalFormat df = new DecimalFormat("#.##");
		
		//loop through 1 - 100 and convert the gallons to liters
		for(gallons = 1; gallons <= 100; gallons++)	{
			liters = gallons * 3.7854;
			//format the gallons and liters conversion to two decimal places
			System.out.println(df.format(gallons) + " gallons is " + df.format(liters) + " liters.");
			//increment counter
			counter++;
			
			//if the counter has got to ten print a blank line and set counter back to 0.
			if(counter == 10)	{
				System.out.println();
				counter = 0;
			}	
		}
	}
	
}

