package Medium_Problems.Arrays.kth_element_of_two_sorted_Arrays;

public class kthElementInSortedArray {
    // public static void main(String[] args) {
    //     int arr1[] = { 100, 112, 256, 349, 770 };
    //     int arr2[] = { 72, 86, 113, 119, 265, 445, 892 };
    //     int arr1Length = arr1.length;
    //     int arr2Length = arr2.length, index = 7;
    //     System.out.println(kthElement(arr1, arr2, arr1Length, arr2Length, index));
    // }

    public static long kthElement(int arr1[], int arr2[], int arr1Length, int arr2Length, int index) {
        int[] ans = new int[arr1Length + arr2Length];
        int i = 0, j = 0, x = 0;

        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] < arr2[j]) {
                ans[x] = arr1[i];
                i++;
            } else {
                ans[x] = arr2[j];
                j++;
            }
            x++;
        }
        while (i < arr1Length) {
            ans[x] = arr1[i];
            i++;
            x++;
        }
        while (j < arr2Length) {
            ans[x] = arr2[j];
            j++;
            x++;
        }

        return ans[index - 1];
    }
}
