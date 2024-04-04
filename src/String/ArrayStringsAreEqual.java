package String;

public class ArrayStringsAreEqual {
    public static void main(String[] args) {
       String[] word1 = {"ab", "c"};
        String[]  word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));

    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String newWord1="";
        for (int i = 0; i < word1.length; i++) {
            newWord1 += word1[i];
        }

        String newWord2="";
        for (int j = 0; j < word2.length; j++) {
            newWord2 += word2[j];
        }

        if(newWord1.equals(newWord2))
        {
            return true;
        }

return false;


    }
}
