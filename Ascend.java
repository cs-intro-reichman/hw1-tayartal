// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int limit = Integer.parseInt(args[0]);
		int a = (int)((Math.random() * limit) + 1);
		int b = (int)((Math.random() * limit) + 1);
		int c = (int)((Math.random() * limit) + 1);
		int minValue = Math.min(a, Math.min(b,c));
		int maxValue = Math.max(a, Math.max(b,c));
		int middleValue = a + b + c - minValue - maxValue;
		System.out.println(a + " " + b + " " + c);
		System.out.println(minValue + " " + middleValue + " " + maxValue);
		

	}
}
