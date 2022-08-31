`Problem link :` [GFG](https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/0)

# Logic
1. Suppose we have 3 disk to move from `1st rod` to `3rd rod`, so `N = 3`.
2. First we run `tohanoi()` where `N = N-1` because we want to insert `largest disk` into `3rd rod`.
- So that we have to move our `smallest` and `2nd smallest` disk from `1st rod` to `2nd rod`, so that we pass a function parameter like `tohanoi(N - 1, start, aux, destinatiom)`. Here we use our `aux space` as a `destination space` and our `destination space` as an `aux space`.
3. Then we moved our `largest disk` and print it.
4. Now again we run `tohanoi()` where `N = N-1` because we have to move our `smallest` and `2nd smallest` disk from `2nd rod` to `3rd rod`, so that we pass a function parameter like `tohanoi(N - 1, aux, destinatiom, start)`. Here we use our `aux space` as a `start space` and our `destination space` as an `destination space`.
5. Then `return (long) Math.pow(2, N) - 1`. This is for count total number of step to move all the 3 disk.

# Steps, Recursion tree and Time Complexity and Recurrence relation 