package Basic_Problems.Arrays.factDigit;

class Solution
{
    int findNum(int n)
    {
        if(n==1){
           return 5;
        } 
        int left=0, right=5*n;
        while(left<right){
            int mid=left+(right-left)/2;
            if(fact(mid,n)){
               right=mid;
            }
            else{
               left=mid+1;
            }
        }
        return right;
    }
    
    boolean fact(int mid,int n){
        int prod=5,count=0;
        while(prod<=mid){
            count+=mid/prod;
            prod*=5;
        }
        return count>=n;
    }
   
}
