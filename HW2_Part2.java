/***************************************
* HW2_Part2.java
* Jack Woodrow
*
* This programme requests a pitchers name, runs, and innings pitched and returns their ERA
***************************************/

import java.util.Scanner;

public class HW2_Part2
{
    public static void Print(String input)
    {
        System.out.print(input);
    }

    public static String UsrIn()
    {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static int NumIn()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static double ERA(int runs, int pitches)
    {
        return runs * 9.0 / pitches;
    }

    public static void main(String[] args)
    {
        String fname;
        String lname;
        int    eruns;
        int    pitch;

        Print("Pitcher's first name: ");
        fname = UsrIn();

        Print("Pitcher's last name: ");
        lname = UsrIn();

        Print("Number of runs earned: ");
        eruns = NumIn();

        Print("Number of innings pitched: ");
        pitch = NumIn();

        System.out.println(fname + " "  + lname + " had an ERA of " + ERA(eruns,pitch));
    }
}

