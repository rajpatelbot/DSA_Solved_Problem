package Basic_Problems.Arrays.IndexReturn;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

public class Indexes {
    public pair indexes(long v[], long x) {
        // Your code goes here
        int left = 0, right = v.length - 1;
        pair pr = new pair(-1, -1);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x < v[mid]) {
                right = mid - 1;
            } else if (x > v[mid]) {
                left = mid + 1;
            } else if (v[mid] == x) {
                pr.first = mid;
                right = mid - 1;
            }
        }

        left = 0;
        right = v.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x < v[mid]) {
                right = mid - 1;
            } else if (x > v[mid]) {
                left = mid + 1;
            } else if (v[mid] == x) {
                pr.second = mid;
                left = mid + 1;
            }
        }
        return pr;
    }
}