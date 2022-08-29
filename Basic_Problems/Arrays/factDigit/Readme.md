 - Algorith to solve this problem :-
     1. If n==1 than return simple 5 because 5! have one zero.
     2. Now i making loop which take O(log2n * log5n) time complexicity.First i initialize l=0 and there  our output lie between 0 to 5*n.
     ex. 5! -> l=0 to r=5*1.
          10! -> l=0 to r=5*2.
          15!, 20!, etc.
      3. Now loop run continue until l not bigger than r.Repeat 
      4.find mid and pass fact(mid,n) method which calculate how many zero have mid  and compare no of zero with n.If count>=n than return true else false.
      5. If true than set r=mid because mid could our answer and we would find smallest fact.Else set l=mid+1.
      6. Return right.
