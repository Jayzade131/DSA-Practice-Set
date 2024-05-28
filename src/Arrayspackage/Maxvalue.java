package Arrayspackage;

public class Maxvalue {

    public static void main(String[] args) {
        int[] element2 = { 1, 3, 7, 3, 8, 6 };

        System.out.println(findMaxValue(element2));

    }

    static int findMaxValue(int[] element2) {
        int maxvalue = element2[0];
        for (int i = 1; i < element2.length; i++) {
            if (element2[i] > maxvalue) {
                maxvalue = element2[i];
            }
        }
        return maxvalue;
    }

}
