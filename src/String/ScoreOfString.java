package String;

public class ScoreOfString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
        int sum = 0;
        int min;

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            min = Math.abs((int) ch[i] - (int) ch[i + 1]);

            sum = sum + min;
        }

        return sum;

    }

}
