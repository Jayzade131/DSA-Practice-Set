package Arrayspackage;

public class IsNStraightHand {

    public static void main(String[] args) {
        int[] hand = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
        int groupSize = 3;

        System.out.println(isNStraightHand(hand, groupSize));
    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {

        int size = hand.length;
        if (size % groupSize == 0) {
            return true;
        }
        return false;
    }

}
