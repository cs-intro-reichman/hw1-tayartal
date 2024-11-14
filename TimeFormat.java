// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		if (args.length != 1) {
            System.out.println("Usage: java TimeFormat <hh:mm>");
            return;
        }
		String input = args[0];
        if (input.length() != 5 || input.charAt(2) != ':') {
            System.out.println("Invalid time format. Please use the hh:mm format.");
            return;
        }
		if (hours > 23 || hours < 0 ) {
			System.out.println("Invalid hours , should be a digit 0 and 23");
            return;
		}
		if (minutes > 59 || minutes < 0 ) {
			System.out.println("Invalid minutes , should be a digit 0 and 59");
            return;
		}
		int hours12;
        if (hours == 12) {
			hours12 = 12;
		}
		else if (hours == 00) {
			hours12 = 0;
		}
		else hours12 = hours % 12;
		if (hours < 12) {
			if (minutes < 10) {
				System.out.println(hours12 + ":0" + minutes + " AM");
			}
			else System.out.println(hours12 + ":" + minutes + " AM");
		}
		else {
			if (minutes < 10) {
				System.out.println(hours12 + ":0" + minutes + " PM");
			}
			else System.out.println(hours12 + ":" + minutes + " PM");
		}

	}
}