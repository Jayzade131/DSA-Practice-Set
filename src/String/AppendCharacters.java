package String;

public class AppendCharacters {

    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        System.out.println();
        System.out.println(appendCharacters(s, t));

    }

    public static int appendCharacters(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;

        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                tIdx++;
            }
            sIdx++;
        }
        return t.length() - tIdx;
    }

}
