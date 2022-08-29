package Basic_Problems.Arrays.Number_Digit;

public class Number_Digit_Sum{
    public static void main(String[] args) {
        long N = 10, k = 5;
        System.out.println(numberCount(N, k));
    }

    private static long numberCount(long N, long k) {
        long sum = 0, n = N;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        long diff = N - sum, i = 10, ans = 0, count = 0;
        while (i <= N) {
            ans = N - diff;
            if (ans >= k) {
                count++;
            }
            i++;
        }
        if (ans <= k) {
            return ans;
        }
        return count;
    }
}