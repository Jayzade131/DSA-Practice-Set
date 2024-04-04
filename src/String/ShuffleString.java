package String;

public class ShuffleString {
    public static void main(String[] args) {
       String s = "codeleet";
      int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] result = new char[n];

        for (int i = 0; i < n; i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }
}
