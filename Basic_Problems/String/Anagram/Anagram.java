package Basic_Problems.String.Anagram;

import java.util.ArrayList;

public class Anagram {
    // public static void main(String[] args) {
    //     String s1 = "allergy";
    //     String s2 = "allergi";
    //     System.out.println(isAnagram(s1, s2));
    // }
    
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        ArrayList<Character> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            ans.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            ans.remove(new Character(t.charAt(i)));
        }
        if (ans.size() == 0) {
            return true;
        }
        return false;
    }
}
