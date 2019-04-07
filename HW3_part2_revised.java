/***************************************
* HW3_Part2_revised.java
* Jack Woodrow
*
* This programme verifies the validity of a lock code
***************************************/

import java.util.Scanner;

public class HW3_Part2_revised
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        String code;

        System.out.print("Please input the lock code: ");
        code = sc.nextLine();

        if (code.charAt(2) != 'R' || code.charAt(8) != 'R' || code.charAt(5) != 'L' || code.length() != 9)
        {
            System.out.println("The code " + code + " is not valid");
        }
        else if (test(code,0))
        {
            System.out.println("The code " + code + " is valid");
        }
    }

    public static boolean test(String code, int pos)
    {

        if (pos == code.length() - 1) return true;

        if (pos == 2 || pos == 5 || pos == 8) pos++;

        if (code.charAt(pos) >= '0' && code.charAt(pos) <= '9')
        {
            pos++;
            return test(code, pos);
        }
        else
        {
            return false;
        }

    }

}
