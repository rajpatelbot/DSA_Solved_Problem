package Basic_Problems.Arrays.RBS_Search_min;

class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int s, int e) {
        // Your code here
        int pivot = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                pivot = mid;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                pivot = mid - 1;
            }
            if (arr[mid] < arr[s]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        if (pivot == arr.length - 1) {
            return arr[0];
        } else {
            return arr[pivot + 1];
        }
    }
}