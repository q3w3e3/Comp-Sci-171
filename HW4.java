/***************************************
* HW4.java
* Jack Woodrow
*
* This programme plays a dice game:
 *
 *§ A Pair is when both dice have the same number on their top faces.
 * § A Straight is when both dice have a different number on their top faces - but they are
 * § consecutive numbers.
 * § A Junker is then anything that is not a Pair or a Straight
 * § The Player can only win with a Pair or a Straight
 * § Any Pair beats any Straight
 * § Any Pair beats any Junker
 * § Any Straight beats any Junker
 * § Two Pairs are compared by their common die values (high wins)
 * § Two Straights are compared by their (higher value) die values (high wins)
 * § In the case of a tie, the Player loses
***************************************/

import java.util.Scanner;
import java.util.Random;

public class HW4
{

    public static int playerScore = 0;
    public static int cpuScore = 0;


    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        Random r = new Random();
        boolean doAgain = true;
        boolean isInvalid = true;
        int player1;
        int player2;
        int cpu1;
        int cpu2;
        int counter = 0;
        String playerType;
        String cpuType;
        String input;

        System.out.print("Welcome to Computer Dice\n" +
                "-----------------------------------------------\n" +
                "You will be playing dice against the computer\n" +
                "you can only win with a Pair or a Straight\n" +
                "any Pair beats any Straight\n" +
                "any Pair beats any Junker\n" +
                "any Straight beats any Junker\n" +
                "in case of two Pairs - high pair wins\n" +
                "in case of two Straights - high Straight wins\n" +
                "in the case of a tie, you lose\n" +
                "-----------------------------------------------\n\n");

        do
        {
            player1 = r.nextInt(5)+1;;
            player2 = r.nextInt(5)+1;;
            System.out.println("The player rolled a " + player1 + " and a " + player2);

            cpu1 = r.nextInt(5)+1;;
            cpu2 = r.nextInt(5)+1;;
            System.out.println("The cpu rolled a " + cpu1 + " and a " + cpu2);

            playerType = type(player1, player2);

            cpuType = type(cpu1, cpu2);

            if (playerType.equals("junker"))
            {
                cpuScore ++;
                System.out.println("CPU wins");
            }
            else if (playerType.equals(cpuType))
            {
                if (Math.max(player1, player2) > Math.max(cpu1, cpu2))
                {
                    playerScore ++;
                    System.out.println("Player wins");
                }
                else
                {
                    cpuScore++;
                    System.out.println("CPU wins");
                }
            }
            else if (playerType.equals("pair") && (cpuType.equals("straight") || cpuType.equals("junker")))
            {
                playerScore ++;
                System.out.println("Player wins");
            }
            else if (playerType.equals("straight") && cpuType.equals("junker"))
            {
                playerScore ++;
                System.out.println("Player wins");
            }
            else
            {
                cpuScore++;
                System.out.println("CPU wins");
            }




            do
            {
                System.out.print("Would you like to play again (y/n): ");
                input = stdIn.next();
                if (input.equalsIgnoreCase("n"))
                {
                    doAgain = false;
                    isInvalid = false;
                }
                else if (input.equalsIgnoreCase("y"))
                {
                    doAgain = true;
                    isInvalid = false;
                }
                else
                {

                    isInvalid = true;
                }

            } while (isInvalid);
            counter ++;
        } while (doAgain == true);

        System.out.println("The player played " + counter + " rounds, won " + playerScore + " of them and lost " + cpuScore);

    }

    public static String type(int first, int second)
    {
        if (first == second)
        {
            return "pair";
        }
        else if (first-second == 1 || first-second == -1)
        {
            return "straight";
        }
        else
        {
            return "junker";
        }

    }

}

