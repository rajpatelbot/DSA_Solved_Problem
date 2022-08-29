package Basic_Problems.Arrays.Roof_Top;

public class max_step {
    public static int maximum_step(int[] a, int n) {
        int i = 1, ans = 0, prev = 0;
        while (i < n) {
            if (a[i] > a[i - 1]) {
                prev++;
            } else {
                prev = 0;
            }
            ans = Math.max(ans, prev);
            i++;
        }
        return ans;
    }
}