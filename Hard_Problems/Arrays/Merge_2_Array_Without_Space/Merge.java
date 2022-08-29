package Hard_Problems.Arrays.Merge_2_Array_Without_Space;

import java.util.Arrays;

public class Merge {
    // public static void main(String[] args) {
    //     long arr1[] = { 1, 3, 5, 7 };
    //     long arr2[] = { 0, 2, 6, 8, 9 };
    //     int arr1Len = arr1.length;
    //     int arr2Len = arr2.length;
    //     merge(arr1, arr2, arr1Len, arr2Len);
    // }

    public static void merge(long[] arr1, long[] arr2, int arr1Len, int arr2Len) {
        int i = arr1Len - 1, j = 0;
        long temp = 0;

        while (i >= 0 && j < arr2Len) {
            if (arr1[i] > arr2[j]) {
                temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                j++;
                i--;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
