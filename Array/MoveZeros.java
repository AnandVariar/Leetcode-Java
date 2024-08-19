package Array;

/*{LEETCODE - 283 MOVE-ZEROS
 * Link : https://leetcode.com/problems/move-zeroes/description/
} */

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 3, 4, 0, 2, 9, 0, 0, 7 };
        movezeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void movezeros(int[] arr) {
        int len = arr.length;
        int j = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return;

        for (int i = j + 1; i < len; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

}
