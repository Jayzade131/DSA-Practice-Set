package Arrayspackage;

import java.util.Arrays;

public class ReverseWord {

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");

        String rev = "";

        for (int i = str.length - 1; i > 0; i--) {

            rev += str[i] + " ";

        }

        return rev + str[0];

    }
}
