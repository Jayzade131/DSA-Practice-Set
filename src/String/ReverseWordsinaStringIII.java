package String;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
       String s = "Let's take LeetCode contest";

    }
    static String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder result=new StringBuilder();

        for (String word : str)
        {
            String reverseString=    reverse(word);
            result.append(reverseString).append(" ");
        }
        return result.toString().trim();
    }

    static  String reverse(String word)
    {
      char[]c=  word.toCharArray();
        int start=0;
        int end= c.length-1;
        while (start<end)
        {
            char temp =c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
        return  new String(c);
    }


}
