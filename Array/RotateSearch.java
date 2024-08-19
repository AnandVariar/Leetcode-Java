package Array;
/*{LEETCODE-33. Search in Rotated Sorted Array}
 * Link : https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 */

public class RotateSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = searchSorted(arr, target);
        System.out.println(result);
    }

    public static int searchSorted(int[] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
