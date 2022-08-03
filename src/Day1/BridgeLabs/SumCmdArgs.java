package Day1.BridgeLabs;

/*
 * This program will sum the given argument values in run time 
 * and if invalid arguments given then it will count the values
 */

public class SumCmdArgs {

	public static void main(String[] args) {
		int sum = 0;
		int invalid = 0;
		System.out.println("Calculates Sum for below Integers");
		for(int i=0; i < args.length; i++) {
			try {
				sum = sum + Integer.parseInt(args[i]);
			}catch (NumberFormatException e) {
				invalid++;
			}
			
		}
		System.out.println("Total no.of arguments: "+ args.length);
		System.out.println("Invalid Integers: " +invalid);
		System.out.println("Sum: " +sum);

	}

}
