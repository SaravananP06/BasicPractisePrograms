package Day1.BridgeLabs;

/*
 * Logic:
 *  1. Any year that is divisible by 400 is definitely a leap year.
 *  2. If it is not divisible by 400, then check if it is divisible by 100, if so, then it is NOT a leap year (even if it is divisible by 4), and
 *  3. If the above two conditions are not satisfied we check for divisibility by 4, if it is divisible by 4 it is a leap year.
 */

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Find Leap Year or not");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:- ");
        int year = sc.nextInt();
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("This is a Leap Year");
                } else {
                    System.out.println("This is not a Leap Year");
                }
            } else {
                System.out.println("This is a Leap Year");
            }
        } else {
            System.out.println("This is a not Leap Year");

        }


	}

}
