package String;

public class HalvesAreAlike {
    public static void main(String[] args) {
     String   s = "book";
        System.out.println(halvesAreAlike(s));
    }

    static boolean halvesAreAlike(String s) {

        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        if(vowels(a)==vowels(b))
        {
            return true;

        }
        return false;

    }

    static int vowels(String word)
    {
        int count=0;
        for (int i = 0; i <word.length() ; i++) {
            char ch =word.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U')
            {
                count++;
            }
        }
        return count;
    }

}
