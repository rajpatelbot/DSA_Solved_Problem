package Hard_Problems.Arrays.Median;

public class Median {
    // public static void main(String[] args) {
    //     int arr1[] = { 4, 6 };
    //     int arr2[] = { 1, 2, 3, 5 };
    //     int arr1Length = arr1.length;
    //     int arr2Length = arr2.length;
    //     System.out.println(medianOfArrays(arr1, arr2, arr1Length, arr2Length));
    // }

    static double medianOfArrays(int[] arr1, int[] arr2, int arr1Length, int arr2Length) {
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

        // 5, 8, 10, 20, 900
        double median = 0;
        if (ans.length % 2 != 0) {
            median = (double) ans[ans.length / 2];
        } else {
            median = (double) (ans[(ans.length - 1) / 2] + ans[ans.length / 2]) / 2;
        }
        return median;
    }
}