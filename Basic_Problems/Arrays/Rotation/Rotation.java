package Basic_Problems.Arrays.Rotation;

public class Rotation {
    public static int findRotation(int[] arr, int n) {
        int k = -1, s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                k = mid;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                k = mid - 1;
            }
            if (arr[mid] < arr[s]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        if (k == arr.length - 1) {
            return 0;
        } else {
            return k + 1;
        }
    }
}