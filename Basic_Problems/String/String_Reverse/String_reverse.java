package Basic_Problems.String.String_Reverse;

class String_Reverse {
    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(reverseStr(str));
    }

    public static String reverseStr(String str) {
        int i = str.length() - 1;
        String str2 = "";
        char temp;
        while (i >= 0) {
            temp = str.charAt(i);
            str2 += temp;
            i--;
        }
        return str2;
    }
}
