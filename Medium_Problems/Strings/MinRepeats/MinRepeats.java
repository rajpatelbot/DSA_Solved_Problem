package Medium_Problems.Strings.MinRepeats;

public class MinRepeats {
    // public static void main(String[] args) {
    //     String s1 = "abcd";
    //     String s2 = "cdabcdab";
    //     System.out.println(minRepeats(s1, s2));
    // }

    public static int minRepeats(String A, String B) {
        int length = B.length() / A.length();
        String s3 = A;
        for (int i = 1; i < length; i++) {
            s3 += A;
        }
        int j = B.length();
        int i = 0;
        while (i < A.length() + B.length()) {
            if (j <= s3.length() && s3.substring(i, j).equals(B)) {
                return length;
            } else if (j > s3.length()) {
                length++;
                s3 += s3;
                i--;
                j--;
            }
            i++;
            j++;
        }
        return -1;
    }
}
