package Basic_Problems.Arrays.SearchMatrix;

public class SearchMatrix {
    public static int matSearch(int mat[][], int N, int M, int x) {
        // your code here
        int i = 0, j = M - 1;
        while (i < N && j >= 0) {
            if (mat[i][j] == x)
                return 1;
            if (mat[i][j] > x)
                j--;
            else
                i++;
        }
        return 0;
    }
}
