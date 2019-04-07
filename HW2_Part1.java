/***************************************
* HW2_Part1.java
* Jack Woodrow
*
* This programme requests a pitchers name, runs, and innings pitched and returns their ERA
***************************************/

import java.util.Scanner;

public class HW2_Part1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String fname;
        String lname;
        int    eruns;
        int    pitch;

        System.out.print("Pitcher's first name: ");
        fname = sc.next();

        System.out.print("Pitcher's last name: ");
        lname = sc.next();

        System.out.print("Number of runs earned: ");
        eruns = sc.nextInt();

        System.out.print("Number of innings pitched: ");
        pitch = sc.nextInt();

        double ERA = eruns * 9.0 / pitch;

        System.out.println(fname + " "  + lname + " had an ERA of " + ERA);
    }
}
