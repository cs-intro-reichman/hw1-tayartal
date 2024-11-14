// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int numberGivven= Integer.parseInt(args[0]);
		//double hundredsNum = Math.floor(numberGivven / 100 );
		int hundreds = numberGivven / 100;
		int tens = (numberGivven % 100) / 10 ;
		int ones = numberGivven % 10;

		System.out.println( hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");



	}
}
