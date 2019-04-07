/***************************************
 * HW5.java
 * Jack Woodrow
 *
 * This programme gets a string deecimal number, and returns the number in binary as a string.
 * (I have chosen to work with same line bracing because it is what I am used to, if I should go back to
 * new line bracing I can do that)
 ***************************************/

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = getDecimal(stdIn);

        System.out.println(input + " in binary is: " + toBinary(input));
	}// end main

    public static boolean isDecimal(String num){
        return num.matches("[0-9]+");
    }// end isDecimal

    public static String getDecimal(Scanner stdIn){
        String input;
        do {
            System.out.print("Please enter the decimal integer you wish to convert (or q to quit): ");
            input = stdIn.next();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Now quitting!");
                System.exit(0);
            }
        } while (!isDecimal(input));

        return input;
    }// end getDecimal

    public static String toBinary(String s){
	    int decimal = Integer.parseInt(s);
	    String binary = "";

        if (decimal!=0) {
            while (decimal>0) {
                binary = Integer.toString(decimal%2) + binary;
                decimal = decimal/2;
            }
            return binary;
        }
        else {
            return "0";
        }
    }// end stringToBinary
}// end class

