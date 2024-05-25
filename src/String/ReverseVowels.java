package String;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));

    }
    public static String reverseVowels(String s) {
       char[] c=s.toCharArray();

       int i=0;
       int j=c.length-1;

       while(i<j && !isVowels(c[i]) )
       {
            i++;
       }
       while(i<j && !isVowels(c[j]))
       {
           j--;
       }

       if(i<j)
       {
            swap(c,i,j);
       }
       return new String(c);

    }

    public static boolean isVowels(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            return true;

        }
        return false;
    }

    static void swap(char[] ch,int item1, int item2)
    {
        char temp =ch[item1];
        ch[item1]=ch[item2];
        ch[item2]=temp;
    }
}
