package Basic_Problems.Arrays.adjacent_differ_by_at_most_k;

import java.util.ArrayList;

public class search {
    class Complete {
        // Function for finding maximum and value pair
        public static int search(int arr[], int n, int x, int k) {
            // Complete the function
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(arr[i]);
            }
            return list.indexOf(x);
        }
    }
}
