package Arrayspackage;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] element = { 10, 20, 30, 40, 50 };
        swap(element, 0, 1);
        System.out.println(Arrays.toString(element));
    }

    static void swap(int[] element, int index1, int index2) {
        int temp = element[index1];
        element[index1] = element[index2];
        element[index2] = temp;
    }
}
