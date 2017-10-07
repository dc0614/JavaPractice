/**
	author: Diana Copeland
	Exercise 2-2	Iterating Through an ArrayList While Applying Conditions
	Iterate through an ArrayList of floats. 
*/

//import ArrayList
import java.util.ArrayList;

public class FishLengthEx	{
	
	public static void main(String[] args)	{
		//required length of fish
		float requireLength = 28.0f;
		
		/* Declare Float ArrayList with initial size of 10.
		   Add the fish lengths to the ArrayList
		*/
		ArrayList<Float> fishLengthList = new ArrayList<Float>();
		fishLengthList.add(10.0f);
		fishLengthList.add(15.5f);
		fishLengthList.add(18.0f);
		fishLengthList.add(29.5f);
		fishLengthList.add(28.0f);
		fishLengthList.add(45.5f);	

		/* Traverse through the ArrayList
		   Compare the elements in the ArrayList to the requireLength variable
		   Print the ArrayList values that are above the requireLength variable
		*/
		for(int i = 0; i < fishLengthList.size(); i++){
			if(fishLengthList.get(i) > requireLength)	{
					System.out.println("This fish is larger than the required length of 28:");
					System.out.println(+ fishLengthList.get(i));
			}
		}
	}
	
	
}