package Medium_Problems.Arrays.valid_pair_sum;

import java.util.Arrays;

public class valid_pair_sum {
    public static void main(String[] args) {
        int a[] = { 3, -2, 1 }, n = a.length;
        System.out.println(ValidPair(a, n));
    }

    static long ValidPair(int a[], int n) {
        long ans = 0;
        Arrays.sort(a); // -2, 1, 3
        int s = 0, e = n - 1;

        while (s < e) {
            int sum = a[s] + a[e];
            if (sum > 0) {
                ans += (e - s);
                e -= 1;
            } else {
                s += 1;
            }
        }
        return ans;
    }
}
