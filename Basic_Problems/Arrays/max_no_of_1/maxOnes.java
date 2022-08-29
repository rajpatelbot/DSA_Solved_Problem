package Basic_Problems.Arrays.max_no_of_1;

public class maxOnes {
    class Sol {
        public static int maxOnes(int Mat[][], int N, int M) {
            int max = 0, n = N, m = M;
            int count = search(Mat[0], m, 0);
            for (int i = 1; i < n; i++) {
                int tempCount = search(Mat[i], m, 0);
                if (count < tempCount) {
                    count = tempCount;
                    max = i;
                }
            }
            return max;
        }

        static int search(int arr[], int m, int target) {
            int left = 0, right = m - 1;
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if (arr[middle] > target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            return m - right;
        }
    }
}
