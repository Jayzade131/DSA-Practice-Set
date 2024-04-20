package String;

public class MaximumRemovals {
    public static void main(String[] args) {
       String s = "abcacb";
        String p = "ab";
       int[] removable = {3,1,0};
        System.out.println(maximumRemovals(s,p,removable));
    }
    static int maximumRemovals(String s, String p, int[] removable) {
            int count=0;
        for (int i = 0; i <removable.length-1 ; i++) {
            String ch= String.valueOf(s.charAt(i));
            s.replace(ch,"");
            if(s.contains(p))
            {
                count++;
            }

        }
        return count;

    }

}
