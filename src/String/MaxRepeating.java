package String;

public class MaxRepeating {
    public static void main(String[] args) {
     String   sequence = "ababc";
       String word = "ab";
        System.out.println(maxRepeating(sequence,word));
    }
    static int maxRepeating(String sequence, String word) {
        String str = word;
        int count = 0;

        // While Loop: Continues as long as sequence contains str
        while(sequence.contains(str)) {
            // Increment count
            count++;
            // Update str by appending the value of word
            str = str + word;
        }

        // Return the final count
        return count;

    }
}
