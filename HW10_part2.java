import java.util.*;

public class HW10_Part2 {
    public static void main(String[] args) {
        char[] set1 = {'a', 'b',};
        printAllKLength(set1,3);
        char[] set2 = {'a', 'b', 'c', 'd'};
        printAllKLength(set2,1);
    }

    public static void printAllKLength(char[] set, int k){
        printAllKLengthRec(set, "", set.length, k);
    }
    public static void printAllKLengthRec(char[] set,String prefix, int n, int k){
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; ++i) {
            String prefixNew = prefix + set[i];
            printAllKLengthRec(set, prefixNew, n, k - 1);
        }
    }
}