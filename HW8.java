/*
 * This programme is a simplified poker game.
 * Jack Woodrow
 */
import java.util.*;

public class HW8{

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int[] hand = new int[4];
        int[] deck = new int[36];
        boolean isValid = true;
        boolean isContinue = true;
        String input = "";
        int chips = 100;
        int bet = 0;

        System.out.println("Welcome to 4 Card Poker\n" +
                           "Your initial bank roll is $100.00");


        do{

            do{
                System.out.print("How much would you like to bet?: ");
                bet = stdIn.nextInt();
                if(bet >0 && bet<=chips) {
                    isValid = true;
                }
                else isValid = false;
            }while(!isValid);

            dealHand(deck,hand);

            if(isQuad(hand)) {
                chips += 6525*bet;
                System.out.println("Quad!");
            }
            else if(is2Pair(hand)) {
                chips += 22*bet;
                System.out.println("Two Pairs!");
            }
            else if(isTrip(hand)) {
                chips += 51*bet;
                System.out.println("Tripple!");
            }
            else if(isPair(hand)) {
                chips += 1*bet;
                System.out.println("Pair!");
            }
            else if(isStraight(hand)) {
                chips += 38*bet;
                System.out.println("Striaght!");
            }
            else {
                chips -= bet;
                System.out.println("Noting.");
            }
            if(chips>0) {
                do {
                    System.out.println("You have: " + chips);
                    System.out.print("Would you like to continue (y/n): ");
                    input = stdIn.next();
                    if (input.equalsIgnoreCase("y")) {
                        isValid = true;
                        isContinue = true;
                    } else if (input.equalsIgnoreCase("n")) {
                        isValid = true;
                        isContinue = false;
                    } else isValid = false;
                } while (!isValid);
            }
            else isContinue = false;
        }while(isContinue);

        System.out.println("you have: " + chips + "\n For a loss/gain of: " + (chips-100));

    }

    public static void initDeck(int[] deck) {
        for(int i = 0; i < deck.length; i+=9) {
            for(int j = 1; j <= 9; j++) {
                deck[i+j-1]=j;
            }
        }
    }

    public static void shuffleDeck(int[] deck, int n) {
        Random random = new Random();
        for(int i=0; i<=n; i++) {
            int pos1 = random.nextInt(36);
            int pos2 = random.nextInt(36);
            int temp = deck[pos1];
            deck[pos1] = deck[pos2];
            deck[pos2] = temp;
        }
    }

    public static void sortHand(int[] hand) {
        for (int i = 0; i < hand.length; ++i) {
            int maxLoc = i;
            for (int j = i+1; j < hand.length; ++j) {
                if (hand[j] > hand[maxLoc]) maxLoc = j;
            }
            int tmp = hand[i];
            hand[i] = hand[maxLoc];
            hand[maxLoc] = tmp;
        }
    }

    public static void dealHand(int [] deck, int[] hand) {
        initDeck(deck);
        shuffleDeck(deck,100);
        for(int i = 0; i < hand.length; i++) {
            hand[i] = deck[i];
        }
        displayHand(hand);
        System.out.println("Lets sort that...");
        sortHand(hand);
        displayHand(hand);
    }

    public static void displayHand(int[] hand) {
        System.out.print("Your hand is: ");
        for(int i = 0; i < hand.length; i++) {
            System.out.print(hand[i] + " ");
        }
        System.out.println();
    }

    public static boolean isQuad(int[] hand){
        for(int i = 1; i < hand.length; i++) {
            if(hand[i]!=hand[0]) return false;
        }
        return true;
    }

    public static boolean isTrip(int[] hand) {
        int ctr = 0;
        for(int i = 1; i < hand.length-1; i++) {
            if(hand[i]==hand[0] || hand[i]==hand[hand.length-1]) ctr++;
        }
        if(ctr==2) return true;
        else return false;
    }

    public static boolean isStraight(int[] hand) {
        for(int i = 1; i < hand.length; i++) {
            if(hand[i]+1!=hand[i-1]) return false;
        }
        return true;
    }

    public static boolean is2Pair(int[] hand) {
        int ctr = 0;
        for(int i = 1; i < hand.length; i+=2) {
            if(hand[i]!=hand[i-1]) ctr++;
        }
        if(ctr==0) return true;
        else return false;
    }

    public static boolean isPair(int[] hand) {
        int ctr = 0;
        for(int i = 1; i < hand.length; i++) {
            if(hand[i]==hand[i-1]) ctr++;
        }
        if(ctr==1) return true;
        else return false;
    }
}