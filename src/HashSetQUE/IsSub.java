package HashSetQUE;

import java.util.HashSet;

public class IsSub {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        int sindex = 0;

        for (int tindex = 0; tindex < t.length() && sindex < s.length(); tindex++) {
            if (s.charAt(sindex) == t.charAt(tindex)) {
                sindex++;
            }
        }
        return sindex == s.length();

    }
}
