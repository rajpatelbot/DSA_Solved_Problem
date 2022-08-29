package Basic_Problems.String.IsoMorphic;

public class IsoMorphic {
    // public static void main(String[] args) {
    //     String str1 = "aab";
    //     String str2 = "xxy";
    //     System.out.println(areIsomorphic(str1, str2));
    // }

    public static boolean areIsomorphic(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        if (str1Length != str2Length) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (arr1[str1.charAt(i)] == 0 && arr2[str2.charAt(i)] == 0) {
                arr1[str1.charAt(i)] = str2.charAt(i);
                arr2[str2.charAt(i)] = str1.charAt(i);
            } else if (arr1[str1.charAt(i)] != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
