/**
	author: Diana Copeland
	Exercise 2-1	Evaluating the String Class in the switch Statement
*/

public class StrSwitchEx	{

	public static void main(String[] args)	{
		
		//String to set for conditional switch statement
		String myStr = "Hello World";
		
		/* Switch statement to compare the String to multiple Strings and once a matching 
		   String is found a statement is  printed
		*/
		switch (myStr)	{
			case	"I love you":	
				break;
			case	"I miss you":
				break;
			case	"Hello World!":
				break;
			case	"Hello World":
				//statement will print once matching String is found.
				System.out.println("Oh, you found me! Hello World!");
				break;
			default:	
				break;
		}
		
	}

}