package Basic_Problems.Arrays.Count_smaller_element_of_two_array;

import java.util.ArrayList;
import java.util.Arrays;

public class count {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        // add your code here
        ArrayList<Integer> list1 = new ArrayList<>();
        Arrays.sort(arr2);
        for (int i = 0; i < m; i++) {
            list1.add(search(arr2, arr1[i]));
        }
        return list1;
    }

    static int search(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return right + 1;
    }
}