/***************************************
* HW3_Part2.java
* Jack Woodrow
*
* This programme verifies the validity of a lock code
***************************************/

import java.util.Scanner;

public class HW3_Part2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String code;

        System.out.print("Please input the lock code (ddRddLddR): ");
        code = sc.nextLine();

        if (code.length() == 9)
        {
            if (code.charAt(2) == 'R' && code.charAt(8) == 'R')
            {
                if (code.charAt(5) == 'L')
                {
                    if (code.charAt(0) >= '0' && code.charAt(0) <= '9' &&
                        code.charAt(1) >= '0' && code.charAt(1) <= '9' &&
                        code.charAt(3) >= '0' && code.charAt(3) <= '9' &&
                        code.charAt(4) >= '0' && code.charAt(4) <= '9' &&
                        code.charAt(6) >= '0' && code.charAt(6) <= '9' &&
                        code.charAt(7) >= '0' && code.charAt(7) <= '9')
                    {
                        System.out.println("The lock code " + code + " is valid");
                    }
                    else
                    {
                        System.out.println("The lock code is not valid");
                    }
                }
                else
                {
                    System.out.println("The lock code is not valid");
                }
            }
            else
            {
                System.out.println("The lock code is not valid");
            }
        }
        else
        {
            System.out.println("The lock code is not valid");
        }
    }
}
