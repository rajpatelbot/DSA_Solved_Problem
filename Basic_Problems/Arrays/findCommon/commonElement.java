package Basic_Problems.Arrays.findCommon;

import java.util.ArrayList;

public class commonElement {
    public static void main(String[] args) {
        int[] v1 = { 3, 4, 2, 2, 4 };
        int[] v2 = { 3, 2, 2, 7 };
        System.out.println(common_element(v1, v2));
    }

    public static ArrayList<Integer> common_element(int[] v1, int[] v2) {
        int i = 0, j = 0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while (i < v1.length) {
            if (list1.contains(v1[i])) {
                ++i;
                continue;
            }
            list1.add(v1[i]);
            ++i;
        }

        while (j < v2.length) {
            if (list2.contains(v2[j])) {
                ++j;
                continue;
            }
            list2.add(v2[j]);
            ++j;
        }
        return list2;
    }
}