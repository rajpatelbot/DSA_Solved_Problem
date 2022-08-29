[Problem Link](https://practice.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1?page=3&category[]=Searching&sortBy=submissions)

# Logic 

Here we have to count numbers of zeroes occurs in the sorted matrix and return it.

# Explaination of the code
Step-1: First created 3 variables called <mark>i, j, count</mark> which is a int type.\
Step-2: Initialized i=array.length-1, j=0, count=0.\
Step-3: Used a while loop with <mark>i >= 0 && j < arr[0].length</mark>. It means the loop will run according to row's length.\
Step-4: Then we check that condition that <mark>array[i][j] == 0</mark> then we increase our count variable to 1 and also increase j to 1 so that execution will go at coloumn of the same row.\
Step-5: If that condition will become false then decrease <mark>i with 1 and j=0</mark>.\
Step-6: Return count.
