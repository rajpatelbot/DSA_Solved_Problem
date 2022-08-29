package Basic_Problems.Arrays.k_th_missing_element;

public class MissingElement {
    // public static void main(String[] args) {
    //     int arr[] = { 1, 3, 4, 5, 7 };
    //     int k = 2;
    //     System.out.println(KthMissingElement(arr, k));
    // }

    public static int KthMissingElement(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff > k)
                return arr[i] + k;
            k -= diff - 1;
        }
        return -1;
    }
}
