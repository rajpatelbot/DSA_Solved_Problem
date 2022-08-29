package Basic_Problems.Arrays.setDigit;

import java.util.ArrayList;

public class setDigit {
    public static void main(String[] args) {
        int n = 314;
        System.out.println(findNext(n));
    }

    public static ArrayList findNext(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        int N = n;
        while (N > 0) {
            int r = N % 10;
            digits.add(r);
            N = N / 10;
        }
        return digits;
    }
}
