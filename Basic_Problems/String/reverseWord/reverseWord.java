package Basic_Problems.String.reverseWord;
// incorrect

public class reverseWord {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str) {
        String ansStr = "";
        String finalStr = "";
        Character temp = null, reverse = null;
        
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = str.charAt(i);
            ansStr += Character.toString(temp);
        }
        
        int j = 0, k = 0;
        while (j < ansStr.length()) {
            k = ansStr.indexOf(".", 0);
            if (j < k) {
                reverse = ansStr.charAt(--j);
                finalStr += Character.toString(reverse);
            } else {
                j++;
            }
        }
        return ansStr;
    }
}
