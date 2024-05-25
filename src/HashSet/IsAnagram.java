package HashSet;

import java.util.HashSet;

public class IsAnagram {

    public static void main(String[] args) {
      String  s = "anagram";
      String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
           char[] s1= s.toCharArray();
           char[] t1=t.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < s1.length; i++) {
                set.add(s1[i]);
        }

        for (int j = 0; j < t1.length; j++) {
            if(!set.contains(t1[j]))
            {
                return false;
            }
        }
        return true;
     }
}
