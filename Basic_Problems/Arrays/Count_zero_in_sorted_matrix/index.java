package Basic_Problems.Arrays.Count_zero_in_sorted_matrix;

// @ GFG_Basic_Problem

// @ Problem_name : "Count zeros in a sorted matrix"
// @ Problem_link : "https://practice.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1?page=3&category[]=Searching&sortBy=submissions"

// @ Solution :

class GfG
{
    int countZeros(int A[][], int N)
    {
        // Your code here
        int i = A.length-1;
        int j = 0;;
        int count = 0;
        while(i>=0 && j<A[0].length){
            if(A[i][j]==0){
                count++;
                j++;
            }else{
                j=0;
                i--;
            }
        }
        return count;
    }
}
