import java.util.*;

public class HW9 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int input;
        String[] words = new String[100];
        int numWords = 0;
        String word;

        do{
            input = getMenuChoice(stdIn);
            switch (input) {
                case 1:
                    System.out.print("What word would you like to add: ");
                    word = stdIn.next();
                    if (addWord(words, numWords, word)){
                        numWords++;
                        System.out.println("added");
                    }
                    else
                        System.out.println("failed");
                    break;
                case 2:
                    System.out.print("What word would you like to remove: ");
                    word = stdIn.next();
                    if (removeWord(words, numWords, word)){
                        numWords--;
                        System.out.println("removed");
                    }
                    else
                        System.out.println("failed");
                    break;
                case 3:
                    printWords(words, numWords);
                    break;
            }

        }while(input!=4);

    }

    public static boolean addWord(String[] words, int numWords, String word) {
        if(findWord(words, numWords, word)==-1) {
            words[numWords] = word;
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean removeWord(String[] words, int numWords, String word) {
        if(findWord(words, numWords, word)==-1) {
            return false;
        }
        else {
            for (int i = findWord(words, numWords, word); i < numWords; i++)
            {
                words[i] = words[i+1];
            }
            return true;
        }
    }

    public static void printWords(String[] words, int numWords) {
        Arrays.sort(words,0,numWords);
        for(int i = 0; i < numWords; i++) {
            System.out.print(words[i] + " ");
        }
    }

    private static int findWord(String[] words, int numWords, String word) {
        Arrays.sort(words,0,numWords);
        int first = 0;
        int last  = numWords;

        while (first < last) {
            int mid = (first + last) / 2;
            if (word.compareTo(words[mid]) < 0)
                last = mid;
            else if (word.compareTo(words[mid]) > 0)
                first = mid + 1;
            else
                return mid;
        }
        return -(first + 1);
    }

    private static int getMenuChoice(Scanner stdIn) {
        String input;
        do{
            System.out.println("1. Add Word \n" +
                    "2. Remove Word \n" +
                    "3. Print Words \n" +
                    "4. Quit");
            input = stdIn.next();
        }while(!input.matches("^[1-4]$"));
        return Integer.parseInt(input);
    }
}