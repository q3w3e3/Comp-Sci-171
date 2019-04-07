/***************************************
 * HW3_Part1.java
 *
 *
 *
 ***************************************/

import java.util.Scanner;
import java.lang.Math;

public class HW3_Part1
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		double a;
		double b;
		double c;
		double x;
		double solutionOne;
		double solutionTwo;
		System.out.print("Enter an number for a:");
		a = stdIn.nextDouble();
		System.out.print("Enter an number for b:");
		b = stdIn.nextDouble();
		System.out.print("Enter an number for c:");
		c = stdIn.nextDouble();

		x = Math.sqrt((b)*(b)-(4*a*c));
		solutionOne = (-b + (x)) / (2*a);
		solutionTwo = (-b - (x)) / (2*a);

		if (x*x < 0)
			System.out.print("This equation has no real solutions.");
		else if (x*x == 0)
			System.out.print("The solutions is:" + solutionTwo);
		else
			System.out.print("The solutions are:" + solutionOne + " " + solutionTwo);

	}
}
