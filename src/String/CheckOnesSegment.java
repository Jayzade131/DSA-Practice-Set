package String;

public class CheckOnesSegment {
    public static void main(String[] args) {
      String  s = "1001";
        System.out.println(checkOnesSegment(s));
    }

    static boolean checkOnesSegment(String s) {
        char[] str=  s.toCharArray();


        for (int i = 0; i < str.length-1 ; i++) {
            if(str[i]=='0' && str[i+1]=='1')
            {
                return false;
            }

        }
        return true;

    }
}
