package BinarySearchAlogrithm;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Que1 {
    public static void main(String[] args) {
        //letters = ["c","f","j"], target = "a"
        char[] letters = {'c','f','j'};
        char target='a';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid -1 ;
            }
            else  {

                start = mid + 1;
            }


        }
        return letters[start % letters.length];
    }
}
