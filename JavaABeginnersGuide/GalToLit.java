/*
	Diana Copeland
	Try This 1-1	Converting Gallons To Liters
	Create a program that converts gallons to liters
*/

class	GalToLit	{
	public static void main(String[] args)	{
		//declare two double variables - one for gallons and one for liters
		double gallons;
		double liters;
		
		//initiate the gallons variable
		gallons = 10;
		
		//initiate liters 
		liters = gallons * 3.7854;
		
		//print out the gallons to liters conversion result
		System.out.println(gallons + " gallons is " + liters + " liters.");
	}
	
}