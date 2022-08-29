package Basic_Problems.String.String_Rotation;

public class String_Rotation {
    // public static void main(String[] args) {
    //     String s1 = "geeksforgeeks";
    //     String s2 = "forgeeksgeeks";
    //     System.out.println(areRotations(s1, s2));
    // }

    public static boolean areRotations(String s1, String s2) {
        return ((s1.length() == s2.length()) && ((s1 + s1).contains(s2)));
    }
}