package Array;

/*{LEETCODE - 977 SQUARES OF SORTED ARRAY}
 * Link : https://leetcode.com/problems/squares-of-a-sorted-array/
 */

import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        int[] sq = square(arr);
        for (int i : sq) {
            System.out.print(i + " ");
        }
    }

    public static int[] square(int[] arr) {
        int len = arr.length;
        int[] ar = new int[len];
        for (int i = 0; i < len; i++) {
            ar[i] = arr[i] * arr[i];
        }
        Arrays.sort(ar);
        return ar;
    }

}
