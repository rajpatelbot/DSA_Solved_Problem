package Medium_Problems.Arrays.sort_array_according_to_others;
// 2 2 1 1 8 8 3 5 6 7 9

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class sortA1A2 {
    public static void main(String[] args) {
        int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 },
                A2[] = { 2, 1, 8, 3 };
        int n = A1.length, m = A2.length;
        System.out.println(sortA1ByA2(A1, n, A2, m));
    }

    public static int[] sortA1ByA2(int[] A1, int N, int[] A2, int M) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ind = 0, ans[] = new int[N];
        for (int i = 0; i < N; i++) {
            if (!mp.containsKey(A1[i]))
                mp.put(A1[i], 1);
            else
                mp.put(A1[i], mp.get(A1[i]) + 1);
        }
        for (int i = 0; i < M; i++) {
            if (mp.containsKey(A2[i])) {
                for (int j = 1; j <= mp.get(A2[i]); j++)
                    ans[ind++] = A2[i];
            }
            mp.remove(A2[i]);
        }
        List<Integer> list = new ArrayList<>(mp.keySet());
        Collections.sort(list);
        int i = 0;
        while (i < list.size()) {
            for (int j = 0; j < mp.get(list.get(i)); j++)
                ans[ind++] = list.get(i);
            i++;
        }
        return ans;
    }
}