package HashSet;

import java.util.HashSet;

public class Pangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        checkIfPangram(sentence);
    }

    public static boolean checkIfPangram(String sentence) {
        String sen = sentence.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
            set.add(i);
        }

        for (int i = 0; i < sen.length(); i++) {
            char current = sen.charAt(i);
            if (current >= 'a' && current <= 'z') {
                set.remove(current);
            }
        }

        return set.isEmpty();
    }
}
