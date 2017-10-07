/**
	Diana Copeland
	Exercise 3-1: Using Compound Assignment Operators
*/

public class Main {
	
	public static void main(String[] args)	{
			byte a;
			//prints 13
			a = 10;
			System.out.println(a += 3);
			//prints 12
			a = 15;
			System.out.println(a -= 3);
			//prints 60
			a = 20;
			System.out.println(a *= 3);
			//prints 8
			a = 25;
			System.out.println(a /= 3);
			//prints 0
			a = 30;
			System.out.println(a %= 3);
			
			/*	Anything below this point is not covered on the OCA	*/
			a = 35;
			System.out.println(a &= 3);
			a = 40;
			System.out.println(a ^= 3);
			a = 45;
			System.out.println(a |= 3);
			a = 50;
			System.out.println(a <<= 3);
			a = 55;
			System.out.println(a >>= 3);
			a = 60;
			System.out.println(a >>>= 3);
	}
	
}