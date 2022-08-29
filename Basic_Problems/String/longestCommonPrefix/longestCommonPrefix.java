package Basic_Problems.String.longestCommonPrefix;

import java.util.Arrays;

public class longestCommonPrefix {
    // public static void main(String[] args) {
    //     String strs[] = { "geeksforgeeks", "geeks", "geezer" };
    //     System.out.println(longCommonPrefix(strs));
    // }

    public static String longCommonPrefix(String[] strs) {
        String c = "";
        Arrays.sort(strs);

        for (int i = 0; i < strs[0].length(); i++) {
            String a = strs[0];
            String b = strs[strs.length - 1];
            if (a.charAt(i) == b.charAt(i))
                c += a.charAt(i);
            else
                break;
        }
        return c == "" ? "-1" : c;
    }
}
