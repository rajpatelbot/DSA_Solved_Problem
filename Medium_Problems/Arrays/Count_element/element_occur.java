package Medium_Problems.Arrays.Count_element;

public class element_occur {
    public static int countOccurence(int[] arr, int n, int k) {
        int max = arr[0], count = 0;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int newArr[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            newArr[arr[i]]++;
        }
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > n / k) {
                count++;
            }
        }
        return count;
    }
}
