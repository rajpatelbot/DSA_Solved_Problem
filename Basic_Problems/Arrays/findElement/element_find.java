package Basic_Problems.Arrays.findElement;

public class element_find {
    public static int findElement(int[] arr, int n) {
        int diff = (arr[n - 1] - arr[0]) / n;
        int s = 0, e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (s < mid &&  arr[mid - 1] != (arr[mid] - diff)) {
                return arr[mid] - diff;
            }

            if (mid < e && arr[mid + 1] != (arr[mid] + diff)) {
                return arr[mid] + diff;
            }

            int arithmeticMiddle = arr[0] + diff * mid; // a+(n-1)*d
            if (arr[mid] > arithmeticMiddle) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
    