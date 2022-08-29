[Problem Link](https://practice.geeksforgeeks.org/problems/maximum-sum-of-increasing-order-elements-from-n-arrays4848/1)

- Algorithm to solve this question :-
     1. First find max element from last row.
     2. Take a max and sum variable and store max element into max variable And sum variable to store sum.
     3. Now i started loop from i=n-2 to i=0.Repeat step 4 and 5.
     4. find max element  ith row and which less than max variable. Than change max to with ith row max and add new max into sum variable.
     5. If you can't find element which  is less than max variable in ith row than return 0;
     6. Return sum;
