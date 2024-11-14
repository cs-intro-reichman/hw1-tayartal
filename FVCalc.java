// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double ratePrecent = Double.parseDouble(args[1]);
		double numberOfYears = Double.parseDouble(args[2]);
		double rate = ratePrecent / 100;
		System.out.println("rate " + rate);
		double ratePlusOne = rate + 1;
		double pow = Math.pow(ratePlusOne, numberOfYears);
		double futureValue = currentValue * pow;
		System.out.println("After " + (int)numberOfYears + " years, $" + currentValue + " saved at " + ratePrecent + "% will yield $" + (int)futureValue);

	}
}