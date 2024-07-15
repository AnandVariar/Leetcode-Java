package Strings;

import java.util.*;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = " I.Like.Code";
        System.out.println("The word is: " + str);

        System.out.println("The Reverse word is: " + reverseWord(str));
        sc.close();
    }

    public static String reverseWord(String str) {
        int len = str.length();
        int r;
        StringBuilder s2 = new StringBuilder();

        for (int i = len - 1; i >= 0; i--) {
            if (str.charAt(i) == '.') {
                r = len - i;
                len = i - 1;
                s2.append(str.substring(i + 1, i + r));
                s2.append(".");
            }
        }
        s2.append(str.substring(0, len + 1));

        return s2.toString();
    }
}
