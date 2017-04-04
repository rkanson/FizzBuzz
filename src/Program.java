/*
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” 
 * instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples
 *  of both three and five print “FizzBuzz”.
 *  
 *  @author: Richard Kanson
 *  @date: 4/4/2017
 */

public class Program {

	public static void main (String [] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
			
		}
		
	}
	
}
