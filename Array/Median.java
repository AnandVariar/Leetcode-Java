package Array;

/*{LEETCODE-4 MEDIAN OF 2 SORTED ARRAY
 * link : https://leetcode.com/problems/median-of-two-sorted-arrays/description/
} */

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        int[] arr2 = { 2 };
        double result = median(arr, arr2);
        System.out.println(result);
    }

    public static double median(int[] arr, int[] arr2) {
        int len = arr.length;
        int len2 = arr2.length;
        int[] temp = new int[len + len2];
        double med;
        for (int i = 0; i < len; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < len2; i++) {
            temp[len + i] = arr2[i];
        }
        Arrays.sort(temp);
        if (temp.length % 2 == 0) {
            med = (temp[temp.length / 2 - 1] + temp[temp.length / 2]) / 2.0;
        } else {
            med = temp[temp.length / 2];
        }
        return med;
    }

}
