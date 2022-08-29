package Basic_Problems.Arrays.RepetedElemet;

import java.util.ArrayList;
import java.util.HashMap;

public class Repeted_Element {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 3 };
        int N = arr.length;
        System.out.println(twoRepeated(arr, N));
    }

    public static int twoRepeated(int[] arr, int N) {
        int ans[] = { -1, -1 }, i = 0, j = 0;
        HashMap<Integer, Integer> list = new HashMap<>();

        while (i < arr.length) {
            int freq = 1;
            if (list.get(i) == 2) {
                freq++;
                ++i;
                continue;
            }
            list.put(freq, arr[i]);
            ++i;
        }
        return 0;
    }
}
