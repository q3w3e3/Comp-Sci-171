/***************************************
* HW3_Part1.java
* Jack Woodrow
*
* This programme solves for the solutions of a quadratic
***************************************/

import java.util.Scanner;
import java.lang.Math;

public class HW3_Part1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            double a;
            double b;
            double c;
            double x1;
            double x2;

        System.out.print("Please input the quadratic coefficient (a): ");
        a = sc.nextDouble();

        System.out.print("Please input the linear coefficient (b): ");
        b = sc.nextDouble();

        System.out.print("Please input the constant (c): ");
        c = sc.nextDouble();

        x1 = (-b + (Math.sqrt(b*b - 4 * a * c)))/2*a;
        x2 = (-b - (Math.sqrt(b*b - 4 * a * c)))/2*a;

        if ((b*b - 4 * a * c) < 0)
            System.out.println("there are no real solutions");
        else if ((b*b - 4 * a * c) == 0)
            System.out.println("The solution to the equation is: " + x1);
        else
            System.out.println("The solutions to the equation are: " + x1 + " and " + x2);
    }
}
