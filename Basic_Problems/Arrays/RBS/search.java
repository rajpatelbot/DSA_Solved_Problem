package Basic_Problems.Arrays.RBS;

public class search {
    public static int RBS_Search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int pivot = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && nums[mid] > nums[mid + 1]) {
                pivot = mid;
            }
            if (mid > s && nums[mid] < nums[mid - 1]) {
                pivot = mid - 1;
            }

            if (nums[s] > nums[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        s = 0;
        e = pivot;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else if (nums[mid] > target) {
                e = mid - 1;
            }
        }
        s = pivot + 1;
        e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else if (nums[mid] > target) {
                e = mid - 1;
            }
        }
        return -1;
    }
}
