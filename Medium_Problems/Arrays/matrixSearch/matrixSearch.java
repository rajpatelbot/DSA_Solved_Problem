package Medium_Problems.Arrays.matrixSearch;

public class matrixSearch {
    static boolean search(int matrix[][], int n, int m, int x) {
        int r = 0, c = matrix[0].length - 1;
        // code here
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == x) {
                return true;
            } else if (matrix[r][c] < x) {
                r++;
            } else if (matrix[r][c] > x) {
                c--;
            }
        }
        return false;
    }
}
