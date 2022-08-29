package Basic_Problems.Arrays.maxSum;

import java.util.TreeSet;

public class MaxSum {
    class Complete {
        // Function for finding maximum and value pair
        public static int maximumSum(int n, int m, int arr[][]) {
            int sum = 0, max = 0;
            max = arr[n - 1][0];
            for (int j = 1; j < m; j++) {
                if (max < arr[n - 1][j]) {
                    max = arr[n - 1][j];
                }
            }
            sum += max;

            for (int i = n - 2; i >= 0; i--) {
                Integer ret = find(arr[i], m, max);
                if (ret == null) {
                    return 0;
                } else {
                    max = ret.intValue();
                    sum += max;
                }
            }
            return sum;
        }

        static Integer find(int arr[], int m, int max1) {
            TreeSet<Integer> set = new TreeSet<>();
            for (int j = 0; j < m; j++) {
                set.add(arr[j]);
            }
            return set.floor(max1 - 1);
        }
    }
}