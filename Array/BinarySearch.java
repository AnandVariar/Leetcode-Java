package Array;
/*{LEETCODE- 704 BINARY-SEARCH
 * Link: https://leetcode.com/problems/binary-search/description/
} */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 89, 9, 0 };
        int target = 5;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Not present");
        } else {
            System.out.println("present");
        }
    }

    public static int search(int[] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
